package com.pspdfkit.vangogh.api;

import com.pspdfkit.vangogh.rx.AnimationCompletable;
import io.reactivex.Completable;

/**
 * Class containing convenient animation scheduling methods.
 */
public final class AnimationSchedulers {

    /**
     * Animates given animations at the same time.
     * @param animations Animation to execute together.
     * @return Completable finishing once the last animation is completed.
     */
    public static Completable together(AnimationCompletable... animations) {
        return Completable.mergeArray(animations);
    }

    /**
     * Animates given animations one after another
     * @param animations Animation to execute sequentially.
     * @return Completable finishing once the last animation is completed.
     */
    public static Completable sequentially(AnimationCompletable... animations) {
        return Completable.concatArray(animations);
    }

}
