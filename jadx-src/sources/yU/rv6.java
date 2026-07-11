package yU;

import SJ0.I;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alightcreative.app.motion.persist.j;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class rv6 extends PopupWindow {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LEl f75666n;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.Xo.values().length];
            try {
                iArr[j.Xo.f45843n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.Xo.f45844t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rv6(Context context, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        setWidth(i2);
        setHeight(i3);
        setOutsideTouchable(false);
        setFocusable(true);
        setTouchable(true);
        setAnimationStyle(0);
        I iT = I.t(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(iT, "inflate(...)");
        setContentView(iT.getRoot());
        List listListOf = CollectionsKt.listOf((Object[]) new TextView[]{iT.J2, iT.rl, iT.nr});
        int i5 = j.$EnumSwitchMapping$0[com.alightcreative.app.motion.persist.j.INSTANCE.getWmPosition().ordinal()];
        if (i5 == 1) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setActivated(false);
            }
            iT.J2.setActivated(true);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it2 = listListOf.iterator();
            while (it2.hasNext()) {
                ((TextView) it2.next()).setActivated(false);
            }
            iT.rl.setActivated(true);
        }
        iT.J2.setOnClickListener(new View.OnClickListener() { // from class: yU.Ln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rv6.O(this.f75608n, view);
            }
        });
        iT.rl.setOnClickListener(new View.OnClickListener() { // from class: yU.lej
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rv6.J2(this.f75651n, view);
            }
        });
        iT.nr.setOnClickListener(new View.OnClickListener() { // from class: yU.iwV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rv6.Uo(this.f75644n, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(rv6 rv6Var, View view) {
        LEl lEl = rv6Var.f75666n;
        if (lEl != null) {
            lEl.n(qf.f75663t);
        }
        rv6Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(rv6 rv6Var, View view) {
        LEl lEl = rv6Var.f75666n;
        if (lEl != null) {
            lEl.n(qf.f75661n);
        }
        rv6Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(rv6 rv6Var, View view) {
        XoT.C.Uo(rv6Var, new Function0() { // from class: yU.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rv6.rl();
            }
        });
        LEl lEl = rv6Var.f75666n;
        if (lEl != null) {
            lEl.n(qf.f75660O);
        }
        rv6Var.dismiss();
    }

    public static String rl() {
        return "Remove Watermark";
    }

    public final void KN(LEl lEl) {
        this.f75666n = lEl;
    }
}
