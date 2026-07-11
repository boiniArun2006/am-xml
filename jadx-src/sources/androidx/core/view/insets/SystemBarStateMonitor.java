package androidx.core.view.insets;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class SystemBarStateMonitor {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f36896O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f36897n;
    private Insets nr;
    private final ArrayList rl = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Insets f36898t;

    interface Callback {
        void O(int i2);

        void n(int i2, Insets insets, RectF rectF);

        void nr();

        void rl(Insets insets, Insets insets2);

        void t();
    }

    public static /* synthetic */ void n(SystemBarStateMonitor systemBarStateMonitor) {
        ViewParent parent = systemBarStateMonitor.f36897n.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(systemBarStateMonitor.f36897n);
        }
    }

    void KN() {
        this.f36897n.post(new Runnable() { // from class: androidx.core.view.insets.n
            @Override // java.lang.Runnable
            public final void run() {
                SystemBarStateMonitor.n(this.f36903n);
            }
        });
    }

    void Uo(Callback callback) {
        if (this.rl.contains(callback)) {
            return;
        }
        this.rl.add(callback);
        callback.rl(this.f36898t, this.nr);
        callback.O(this.f36896O);
    }

    boolean gh() {
        return !this.rl.isEmpty();
    }

    void qie(Callback callback) {
        this.rl.remove(callback);
    }

    SystemBarStateMonitor(final ViewGroup viewGroup) {
        int color;
        Insets insets = Insets.f36409O;
        this.f36898t = insets;
        this.nr = insets;
        Drawable background = viewGroup.getBackground();
        int i2 = 0;
        if (background instanceof ColorDrawable) {
            color = ((ColorDrawable) background).getColor();
        } else {
            color = 0;
        }
        this.f36896O = color;
        View view = new View(viewGroup.getContext()) { // from class: androidx.core.view.insets.SystemBarStateMonitor.1
            @Override // android.view.View
            protected void onConfigurationChanged(Configuration configuration) {
                Drawable background2 = viewGroup.getBackground();
                int color2 = background2 instanceof ColorDrawable ? ((ColorDrawable) background2).getColor() : 0;
                if (SystemBarStateMonitor.this.f36896O != color2) {
                    SystemBarStateMonitor.this.f36896O = color2;
                    for (int size = SystemBarStateMonitor.this.rl.size() - 1; size >= 0; size--) {
                        ((Callback) SystemBarStateMonitor.this.rl.get(size)).O(color2);
                    }
                }
            }
        };
        this.f36897n = view;
        view.setWillNotDraw(true);
        ViewCompat.Org(view, new OnApplyWindowInsetsListener() { // from class: androidx.core.view.insets.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view2, WindowInsetsCompat windowInsetsCompat) {
                return SystemBarStateMonitor.rl(this.f36902n, view2, windowInsetsCompat);
            }
        });
        ViewCompat.K(view, new WindowInsetsAnimationCompat.Callback(i2) { // from class: androidx.core.view.insets.SystemBarStateMonitor.2

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final HashMap f36901O = new HashMap();

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat O(WindowInsetsCompat windowInsetsCompat, List list) {
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i3 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) list.get(size);
                    Integer num = (Integer) this.f36901O.get(windowInsetsAnimationCompat);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fN = windowInsetsAnimationCompat.n();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fN;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fN;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fN;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fN;
                        }
                        i3 |= iIntValue;
                    }
                }
                Insets insetsXMQ = SystemBarStateMonitor.this.xMQ(windowInsetsCompat);
                for (int size2 = SystemBarStateMonitor.this.rl.size() - 1; size2 >= 0; size2--) {
                    ((Callback) SystemBarStateMonitor.this.rl.get(size2)).n(i3, insetsXMQ, rectF);
                }
                return windowInsetsCompat;
            }

            private boolean Uo(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if ((windowInsetsAnimationCompat.nr() & WindowInsetsCompat.Type.xMQ()) != 0) {
                    return true;
                }
                return false;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat J2(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                int i3;
                if (!Uo(windowInsetsAnimationCompat)) {
                    return boundsCompat;
                }
                Insets insetsRl = boundsCompat.rl();
                Insets insetsN = boundsCompat.n();
                if (insetsRl.f36410n != insetsN.f36410n) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (insetsRl.rl != insetsN.rl) {
                    i3 |= 2;
                }
                if (insetsRl.f36411t != insetsN.f36411t) {
                    i3 |= 4;
                }
                if (insetsRl.nr != insetsN.nr) {
                    i3 |= 8;
                }
                this.f36901O.put(windowInsetsAnimationCompat, Integer.valueOf(i3));
                return boundsCompat;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void nr(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if (Uo(windowInsetsAnimationCompat)) {
                    for (int size = SystemBarStateMonitor.this.rl.size() - 1; size >= 0; size--) {
                        ((Callback) SystemBarStateMonitor.this.rl.get(size)).t();
                    }
                }
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public void t(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
                if (Uo(windowInsetsAnimationCompat)) {
                    this.f36901O.remove(windowInsetsAnimationCompat);
                    for (int size = SystemBarStateMonitor.this.rl.size() - 1; size >= 0; size--) {
                        ((Callback) SystemBarStateMonitor.this.rl.get(size)).nr();
                    }
                }
            }
        });
        viewGroup.addView(view, 0);
    }

    private Insets mUb(WindowInsetsCompat windowInsetsCompat) {
        return Insets.rl(windowInsetsCompat.Uo(WindowInsetsCompat.Type.xMQ()), windowInsetsCompat.Uo(WindowInsetsCompat.Type.gh()));
    }

    public static /* synthetic */ WindowInsetsCompat rl(SystemBarStateMonitor systemBarStateMonitor, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsXMQ = systemBarStateMonitor.xMQ(windowInsetsCompat);
        Insets insetsMUb = systemBarStateMonitor.mUb(windowInsetsCompat);
        if (!insetsXMQ.equals(systemBarStateMonitor.f36898t) || !insetsMUb.equals(systemBarStateMonitor.nr)) {
            systemBarStateMonitor.f36898t = insetsXMQ;
            systemBarStateMonitor.nr = insetsMUb;
            for (int size = systemBarStateMonitor.rl.size() - 1; size >= 0; size--) {
                ((Callback) systemBarStateMonitor.rl.get(size)).rl(insetsXMQ, insetsMUb);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Insets xMQ(WindowInsetsCompat windowInsetsCompat) {
        return Insets.rl(windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ()), windowInsetsCompat.J2(WindowInsetsCompat.Type.gh()));
    }
}
