package D5a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: D5a.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1324p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1324p f1379n = new C1324p();

    /* JADX INFO: renamed from: D5a.p$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tu.Ew.values().length];
            try {
                iArr[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(boolean z2, String str, Function0 function0, DialogInterface dialogInterface, int i2) {
        if (z2) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setDemoModeMediaAndBuckets(SetsKt.minus(jVar.getDemoModeMediaAndBuckets(), str));
        } else {
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setDemoModeMediaAndBuckets(SetsKt.plus(jVar2.getDemoModeMediaAndBuckets(), str));
        }
        O.f1320n = com.alightcreative.app.motion.persist.j.INSTANCE.getDemoModeMediaAndBuckets();
        function0.invoke();
        dialogInterface.dismiss();
    }

    public final void nr(final View itemView, final tu.Z info, kgE.fuX iapManager, final Function0 refresher) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(refresher, "refresher");
        if (iapManager.rl()) {
            itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: D5a.l4Z
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return C1324p.O(info, itemView, refresher, view);
                }
            });
        }
    }

    private C1324p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(tu.Z z2, View view, final Function0 function0, View view2) {
        final String string;
        String str;
        String str2;
        int i2 = j.$EnumSwitchMapping$0[z2.ViF().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                string = "bucket:" + z2.KN();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            string = z2.nY().toString();
        }
        Intrinsics.checkNotNull(string);
        final boolean zContains = com.alightcreative.app.motion.persist.j.INSTANCE.getDemoModeMediaAndBuckets().contains(string);
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        if (zContains) {
            str = "Remove from Demo Library?";
        } else {
            str = "Add to Demo Library?";
        }
        AlertDialog.Builder message = builder.setTitle(str).setMessage(String.valueOf(z2.HI()));
        if (zContains) {
            str2 = "Remove Item";
        } else {
            str2 = "Add Item";
        }
        message.setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: D5a.mz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C1324p.J2(zContains, string, function0, dialogInterface, i3);
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: D5a.OU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C1324p.Uo(dialogInterface, i3);
            }
        }).create().show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }
}
