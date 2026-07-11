package com.alightcreative.app.motion.activities.edit.widgets;

import BGJ.fuX;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import j9J.I28;
import j9J.w6;
import yU.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j extends RelativeLayout implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private fuX f45187n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f45188t;

    protected void nr() {
        if (this.f45188t) {
            return;
        }
        this.f45188t = true;
        ((g9s) Z()).n((ColorPickerWidget) I28.n(this));
    }

    public final fuX rl() {
        if (this.f45187n == null) {
            this.f45187n = t();
        }
        return this.f45187n;
    }

    protected fuX t() {
        return new fuX(this, false);
    }

    j(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!isInEditMode()) {
            nr();
        }
    }

    @Override // j9J.n
    public final Object Z() {
        return rl().Z();
    }
}
