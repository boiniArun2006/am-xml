package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class e8 {

    class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f48499b;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        a(View view, Runnable runnable) {
            this.f48498a = view;
            this.f48499b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f48499b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f48498a.setVisibility(0);
        }
    }

    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f48501b;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        b(View view, Runnable runnable) {
            this.f48500a = view;
            this.f48501b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f48500a.setVisibility(4);
            Runnable runnable = this.f48501b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f48500a.setVisibility(0);
        }
    }

    public static void a(View view, long j2, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j2);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static boolean b(int i2) {
        return i2 == 0;
    }

    public static void b(View view, long j2, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j2);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static Activity b(View view, C1802k c1802k) {
        if (view == null) {
            return null;
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static boolean a(int i2, int i3) {
        return b(i2) != b(i3);
    }

    public static String a(int i2) {
        if (i2 == 0) {
            return "VISIBLE";
        }
        if (i2 == 4) {
            return "INVISIBLE";
        }
        if (i2 == 8) {
            return "GONE";
        }
        return String.valueOf(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(int i2, int i3, int i5) {
        if (i2 == 0) {
            return new int[]{i3, i5};
        }
        if ((i2 & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) == 119) {
            return new int[]{13};
        }
        if ((i2 & 112) != 112) {
            if ((i2 & 48) == 48) {
                i3 = 10;
            } else if ((i2 & 80) == 80) {
                i3 = 12;
            } else if ((i2 & 16) == 16) {
                i3 = 15;
            }
        }
        if ((i2 & 7) != 7) {
            if ((i2 & 8388611) == 8388611) {
                i5 = 20;
            } else if ((i2 & 3) == 3) {
                i5 = 9;
            } else if ((i2 & 8388613) == 8388613) {
                i5 = 21;
            } else if ((i2 & 5) == 5) {
                i5 = 11;
            } else if ((i2 & 1) == 1) {
                i5 = 14;
            }
        }
        return new int[]{i5, i3};
    }

    public static View b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static void a(View view, final C1802k c1802k) {
        if (view == null || c1802k == null || !o0.b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.applovin.impl.yg
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return e8.a(c1802k, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets a(C1802k c1802k, View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(((Integer) c1802k.a(x4.u2)).intValue());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    public static boolean a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return a(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (a(view, viewGroup.getChildAt(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }
}
