package com.fyber.inneractive.sdk.mraid;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class s extends f {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    @Override // com.fyber.inneractive.sdk.mraid.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ViewGroup viewGroup;
        int iA = a("w");
        int iA2 = a(CmcdData.STREAMING_FORMAT_HLS);
        int iA3 = a("offsetX");
        int iA4 = a("offsetY");
        boolean zEquals = "true".equals(this.f54205b.get("allowOffscreen"));
        if (iA <= 0) {
            iA = this.f54206c.f57144Z;
        }
        if (iA2 <= 0) {
            iA2 = this.f54206c.a0;
        }
        i0 i0Var = this.f54206c;
        com.fyber.inneractive.sdk.web.m mVar = i0Var.f57113b;
        if (mVar == null) {
            return;
        }
        try {
            ViewGroup viewGroup2 = (ViewGroup) mVar.getRootView().findViewById(R.id.content);
            i0Var.f57136R = viewGroup2;
            if (viewGroup2 == null) {
                IAlog.f("Couldn't find content in the view tree", new Object[0]);
                i0Var.a(k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (i0Var.f57133O == com.fyber.inneractive.sdk.web.z.DISABLED) {
                return;
            }
            f0 f0Var = i0Var.f57132N;
            if (f0Var != f0.DEFAULT && f0Var != f0.RESIZED) {
                i0Var.a(k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (iA < 0 && iA2 < 0) {
                i0Var.a(k.RESIZE, "Creative size passed to resize() was invalid.");
                return;
            }
            i0Var.f57142X = false;
            j1 j1Var = i0Var.f57118g;
            if (j1Var != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var).b(false);
            }
            com.fyber.inneractive.sdk.web.d0 d0Var = i0Var.f57134P;
            if (d0Var == com.fyber.inneractive.sdk.web.d0.ALWAYS_VISIBLE || (!i0Var.f57142X && d0Var != com.fyber.inneractive.sdk.web.d0.ALWAYS_HIDDEN)) {
                i0Var.c(true);
            }
            i0Var.d(false);
            i0Var.e0 = com.fyber.inneractive.sdk.util.o.b(iA2);
            i0Var.d0 = com.fyber.inneractive.sdk.util.o.b(iA);
            if (!zEquals) {
                int i2 = (iA3 + iA) - i0Var.f57144Z;
                if (i2 > 0) {
                    iA3 -= i2;
                }
                if (iA3 < 0) {
                    iA3 = 0;
                }
                int i3 = (iA4 + iA2) - i0Var.a0;
                if (i3 > 0) {
                    iA4 -= i3;
                }
                if (iA4 < 0) {
                    iA4 = 0;
                }
            }
            if (i0Var.f57113b != null) {
                int iB = com.fyber.inneractive.sdk.util.o.b(iA);
                int iB2 = com.fyber.inneractive.sdk.util.o.b(iA2);
                com.fyber.inneractive.sdk.web.m mVar2 = i0Var.f57113b;
                ViewGroup.LayoutParams layoutParams = mVar2.getLayoutParams();
                layoutParams.width = iB;
                layoutParams.height = iB2;
                mVar2.setLayoutParams(layoutParams);
                com.fyber.inneractive.sdk.util.o.a(i0Var.f57113b, 17);
                com.fyber.inneractive.sdk.web.m mVar3 = i0Var.f57113b;
                ViewGroup.LayoutParams layoutParams2 = mVar3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = iA3;
                    marginLayoutParams.topMargin = iA4;
                    marginLayoutParams.rightMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    mVar3.setLayoutParams(marginLayoutParams);
                }
            }
            f0 f0Var2 = i0Var.f57132N;
            f0 f0Var3 = f0.RESIZED;
            if (f0Var2 != f0Var3) {
                i0Var.f57132N = f0Var3;
                i0Var.a(new d0(f0Var3));
                int i5 = i0Var.d0;
                if (i5 != -1 && i0Var.e0 != -1) {
                    i0Var.a(new x(com.fyber.inneractive.sdk.util.o.c(i5), com.fyber.inneractive.sdk.util.o.c(i0Var.e0)));
                }
            }
            i0Var.a(k.RESIZE);
            ViewGroup viewGroup3 = (ViewGroup) i0Var.f57113b.getParent();
            if (viewGroup3 == null) {
                viewGroup = null;
            } else {
                View viewFindViewById = viewGroup3.findViewById(com.fyber.inneractive.sdk.R.id.ia_identifier_overlay);
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            }
            com.fyber.inneractive.sdk.web.m mVar4 = i0Var.f57113b;
            if (mVar4 != null && viewGroup != null) {
                viewGroup.setLayoutParams(mVar4.getLayoutParams());
            }
            j1 j1Var2 = i0Var.f57118g;
            if (j1Var2 != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var2).c();
            }
        } catch (Exception unused) {
            IAlog.f("Couldn't find content in the view tree", new Object[0]);
            i0Var.a(k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public s(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
