# VanGogh

Great things are done by a series of small things brought together. RxJava meets Animations.

## Introduction

VanGogh is a lightweight library that takes Android view animation logic and binds it with RxJava2, providing a simple and powerful API for manipulating animations workflow.

It also provides various pre-made commonly used animations such as fading, rotating, moving, etc. with new ones constantly being added. Another thing that you get are the base animation wrappers so you can create your own complex animations with custom actions.

## Key components

The base class for animations is the `Animation` class. If is immutable and it holds the single animation parameters needed for the execution.

It comes with `AnimationBuilder` which is the recommended way to construct `Animation` objects.

RxJava wrapper for `Animation` is `AnimationCompletable` which performs the given `Animation` once subscribed to and stops the animation if subscription (now `Disposable`) is disposed while animation is still executing. It also allows you to define specific actions for when the animation is started, resumed or cancelled so you don't have to register any `ViewPropertyAnimatorListener`s by hand.

Here's a simple example showing how these components integrate with each other:

```java
// Create animation builder for some view.
AnimationBuilder animationBuilder = AnimationBuilder.forView(someView)
        .alpha(0.5f)
        .duration(1500L)
        .interpolator(new LinearInterpolator());

// Build the animation.
Animation animation = animationBuilder.build();

// Wrap it in Completable.
AnimationCompletable animationCompletable = new AnimationCompletable(animation);

// Add action to perform once the animation is started.
animationCompletable.doOnAnimationStart(new Consumer<View>() {
    @Override
    public void accept(View view) throws Exception {
        // Do something with a view.
    }
});

// Subscribing to completable starts its defined animation.
animationCompletable.subscribe();
```

This example is just a presentation of the components and their relations, in real world example you'd you make some construct like this:

```java
// Creates animation completable and subscribes to it starting the defined animation.
AnimationBuilder.forView(someView)
        .alpha(0.5f)
        .duration(1500L)
        .interpolator(new LinearInterpolator())
        .buildCompletable()
        .doOnAnimationStart(new Consumer<View>() {
            @Override
            public void accept(View view) throws Exception {
                // Do something with a view.
            }
        })
        .subscribe();
```

## Chaining animations

The main power of this approach is that it enables you to combine view animations with operators provided by RxJava2 library. That gives you powerful scheduling possibilities, for example:

```java
private AnimationCompletable fadeIn(final View view) {
    return AnimationBuilder.forView(view)
            .alpha(1f)
            .buildCompletable()
            .doOnAnimationReady(new Consumer<View>() {
                @Override
                public void accept(View view) throws Exception {
                    // Set the view to invisible before we start the animation.
                    view.setAlpha(0f);
                }
            });
}

private void startMyAnimations() {
  // Start first animation and then the second one.
  fadeIn(someView).andThen(fadeIn(someOtherView));

  // Start first animation and second animation together.
  fadeIn(someView).mergeWith(fadeIn(someOtherView));
}
```

## Pre-made stuff

VanGogh provides some pre-made common animations and schedulers. Look for those in `com.pspdfkit.vangogh.api` package. For example if we use stuff from `FadeAnimations`:

```java
import static com.pspdfkit.vangogh.api.FadeAnimations.*;

// Quick and slow fade are implementations with some pre-defined durations.
FadeAnimations.fadeInQuick(view1).andThen(FadeAnimations.fadeOutSlow(view2)).subscribe();
```

Or if you use schedulers from `AnimationSchedulers` class:

```java
import static com.pspdfkit.vangogh.api.AnimationSchedulers.*;
import static com.pspdfkit.vangogh.api.FadeAnimations.*;

// Executes specified animations together.
together(fadeIn(view1), fadeIn(view2), fadeIn(view3), ...);

// Executes specified animations one by one.
sequentially(fadeIn(view1), fadeIn(view2), fadeIn(view3), ...);
```
