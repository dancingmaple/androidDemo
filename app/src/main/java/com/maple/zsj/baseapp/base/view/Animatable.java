package com.maple.zsj.baseapp.base.view;

/**
 * Interface that drawables supporting animations should implement.
 * <p>
 * Form:https://github.com/qiujuer/Genius-Android
 *
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public interface Animatable extends android.graphics.drawable.Animatable {
    /**
     * This is drawable animation frame duration
     */
    int FRAME_DURATION = 16;

    /**
     * This is drawable animation duration
     */
    int ANIMATION_DURATION = 250;
}
