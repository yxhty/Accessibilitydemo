package com.yxhty.accessibilitydemo;

import android.view.accessibility.AccessibilityEvent;

import com.yxhty.accessibilityutil.BaseAccessibilityService;


/**
 * 自动打开微信扫一扫
 * <p>
 * Created by yxhty on 18/11/05.
 */

public class AutoScanAccessibilityService extends BaseAccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        super.onAccessibilityEvent(event);
        if (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED &&
                event.getPackageName().equals("com.tencent.mm")) {
            clickTextViewByText("扫一扫");
        }
    }
}
