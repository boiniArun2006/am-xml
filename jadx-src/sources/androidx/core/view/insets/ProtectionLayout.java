package androidx.core.view.insets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.R;
import androidx.core.graphics.Insets;
import androidx.core.view.insets.Protection;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Object f36891O = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f36892n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ProtectionGroup f36893t;

    private void nr() {
        if (this.f36893t != null) {
            removeViews(getChildCount() - this.f36893t.xMQ(), this.f36893t.xMQ());
            int iXMQ = this.f36893t.xMQ();
            for (int i2 = 0; i2 < iXMQ; i2++) {
                this.f36893t.KN(i2).t().Z(null);
            }
            this.f36893t.Uo();
            this.f36893t = null;
        }
    }

    private void rl() {
        if (this.f36892n.isEmpty()) {
            return;
        }
        this.f36893t = new ProtectionGroup(getOrInstallSystemBarStateMonitor(), this.f36892n);
        int childCount = getChildCount();
        int iXMQ = this.f36893t.xMQ();
        for (int i2 = 0; i2 < iXMQ; i2++) {
            n(getContext(), i2 + childCount, this.f36893t.KN(i2));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f36891O) {
            ProtectionGroup protectionGroup = this.f36893t;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.xMQ() : 0);
            if (i2 > childCount || i2 < 0) {
                i2 = childCount;
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public void setProtections(List<Protection> list) {
        this.f36892n.clear();
        this.f36892n.addAll(list);
        if (isAttachedToWindow()) {
            nr();
            rl();
            requestApplyInsets();
        }
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i2 = R.id.f36154J;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor) tag;
        }
        SystemBarStateMonitor systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
        viewGroup.setTag(i2, systemBarStateMonitor);
        return systemBarStateMonitor;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void n(Context context, int i2, Protection protection) {
        int iIk;
        int i3;
        int iAz;
        Protection.Attributes attributesT = protection.t();
        int iO = protection.O();
        int i5 = 4;
        int i7 = -1;
        if (iO != 1) {
            if (iO != 2) {
                if (iO != 4) {
                    if (iO == 8) {
                        iAz = attributesT.az();
                        i3 = 80;
                    } else {
                        throw new IllegalArgumentException("Unexpected side: " + protection.O());
                    }
                } else {
                    iIk = attributesT.Ik();
                    i3 = 5;
                }
            } else {
                iAz = attributesT.az();
                i3 = 48;
            }
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, iAz, i3);
            Insets insetsTy = attributesT.ty();
            layoutParams.leftMargin = insetsTy.f36410n;
            layoutParams.topMargin = insetsTy.rl;
            layoutParams.rightMargin = insetsTy.f36411t;
            layoutParams.bottomMargin = insetsTy.nr;
            final View view = new View(context);
            view.setTag(f36891O);
            view.setTranslationX(attributesT.HI());
            view.setTranslationY(attributesT.ck());
            view.setAlpha(attributesT.gh());
            if (attributesT.r()) {
                i5 = 0;
            }
            view.setVisibility(i5);
            view.setBackground(attributesT.qie());
            attributesT.Z(new Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void J2(float f3) {
                    view.setTranslationX(f3);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void KN(Drawable drawable) {
                    view.setBackground(drawable);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void O(int i8) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.width = i8;
                    view.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void Uo(float f3) {
                    view.setTranslationY(f3);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void n(int i8) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.height = i8;
                    view.setLayoutParams(layoutParams2);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void nr(float f3) {
                    view.setAlpha(f3);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void rl(boolean z2) {
                    view.setVisibility(z2 ? 0 : 4);
                }

                @Override // androidx.core.view.insets.Protection.Attributes.Callback
                public void t(Insets insets) {
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    layoutParams2.leftMargin = insets.f36410n;
                    layoutParams2.topMargin = insets.rl;
                    layoutParams2.rightMargin = insets.f36411t;
                    layoutParams2.bottomMargin = insets.nr;
                    view.setLayoutParams(layoutParams2);
                }
            });
            addView(view, i2, layoutParams);
        }
        iIk = attributesT.Ik();
        i3 = 3;
        i7 = iIk;
        iAz = -1;
        final FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, iAz, i3);
        Insets insetsTy2 = attributesT.ty();
        layoutParams2.leftMargin = insetsTy2.f36410n;
        layoutParams2.topMargin = insetsTy2.rl;
        layoutParams2.rightMargin = insetsTy2.f36411t;
        layoutParams2.bottomMargin = insetsTy2.nr;
        final View view2 = new View(context);
        view2.setTag(f36891O);
        view2.setTranslationX(attributesT.HI());
        view2.setTranslationY(attributesT.ck());
        view2.setAlpha(attributesT.gh());
        if (attributesT.r()) {
        }
        view2.setVisibility(i5);
        view2.setBackground(attributesT.qie());
        attributesT.Z(new Protection.Attributes.Callback() { // from class: androidx.core.view.insets.ProtectionLayout.1
            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void J2(float f3) {
                view2.setTranslationX(f3);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void KN(Drawable drawable) {
                view2.setBackground(drawable);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void O(int i8) {
                FrameLayout.LayoutParams layoutParams22 = layoutParams2;
                layoutParams22.width = i8;
                view2.setLayoutParams(layoutParams22);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void Uo(float f3) {
                view2.setTranslationY(f3);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void n(int i8) {
                FrameLayout.LayoutParams layoutParams22 = layoutParams2;
                layoutParams22.height = i8;
                view2.setLayoutParams(layoutParams22);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void nr(float f3) {
                view2.setAlpha(f3);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void rl(boolean z2) {
                view2.setVisibility(z2 ? 0 : 4);
            }

            @Override // androidx.core.view.insets.Protection.Attributes.Callback
            public void t(Insets insets) {
                FrameLayout.LayoutParams layoutParams22 = layoutParams2;
                layoutParams22.leftMargin = insets.f36410n;
                layoutParams22.topMargin = insets.rl;
                layoutParams22.rightMargin = insets.f36411t;
                layoutParams22.bottomMargin = insets.nr;
                view2.setLayoutParams(layoutParams22);
            }
        });
        addView(view2, i2, layoutParams2);
    }

    private void t() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i2 = R.id.f36154J;
        Object tag = viewGroup.getTag(i2);
        if (tag instanceof SystemBarStateMonitor) {
            SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.gh()) {
                return;
            }
            systemBarStateMonitor.KN();
            viewGroup.setTag(i2, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36893t != null) {
            nr();
        }
        rl();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nr();
        t();
    }
}
