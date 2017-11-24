Change Log
==========

Version 0.2.0 *(2017-x-y)*
----------------------------
* *Importat:* Duration is no more pre-determined by the library but uses the default duration defined by Android in `ValueAnimator`. Quick animations use 60% of that duration value and slow animations use 300%.
* Adds "shake" animations. ([#13](https://github.com/PSPDFKit-labs/VanGogh/issues/13))
    * Adds `ShakeAnimations` class with `shake()`, `shakeQuickly()` and `shakeSlowly()` methods.
* Adds "show as toast" animations. ([#15](https://github.com/PSPDFKit-labs/VanGogh/issues/15))
    * Adds `ToastAnimations` class with `showAsToast()`, `showAsToastQuickly()` and `showAsToastSlowly()` methods.
* Adds "spin" animations. ([#14](https://github.com/PSPDFKit-labs/VanGogh/issues/14))
    * Adds `SpinAnimations` class with `spinLeft()`, `spinLeftQuickly()`, `spinLeftSlowly()` methods for spinning to the left.
    * Adds `SpinAnimations` class with `spinRight()`, `spinRightQuickly()`, `spinRightSlowly()` methods for spinning to the right.

Version 0.1.1 *(2017-11-20)*
----------------------------
* Fixes `NullPointerException` being thrown when animation disposed midway. ([#10](https://github.com/PSPDFKit-labs/VanGogh/issues/10))

Version 0.1.0 *(2017-11-09)*
----------------------------
Initial release.