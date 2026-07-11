package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Comparator f59056n = new j();

    private static ImageView n(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private static List nr(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView O(Toolbar toolbar) {
        List listNr = nr(toolbar, toolbar.getTitle());
        if (listNr.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listNr, f59056n);
    }

    public static ImageView rl(Toolbar toolbar) {
        return n(toolbar, toolbar.getLogo());
    }

    public static TextView t(Toolbar toolbar) {
        List listNr = nr(toolbar, toolbar.getSubtitle());
        if (listNr.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listNr, f59056n);
    }
}
