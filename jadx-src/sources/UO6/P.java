package UO6;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class P {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExportUIMenuItem.values().length];
            try {
                iArr[ExportUIMenuItem.PROJECT_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExportUIMenuItem.TEMPLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Context context, vd vdVar) {
        int i2;
        String strT;
        int i3 = j.$EnumSwitchMapping$0[vdVar.t().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = 2132019038;
            } else {
                i2 = 2132019041;
            }
        } else {
            i2 = 2132019976;
        }
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getProjectPackageFreeUserMaxDownloadSize() > 0) {
            strT = com.alightcreative.app.motion.activities.lej.t(jVar.getProjectPackageFreeUserMaxDownloadSize(), false, 1, null);
        } else {
            strT = "???MB";
        }
        new AlertDialog.Builder(context).o(i2).KN(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{context.getResources().getString(2132019977), context.getResources().getString(2132019618, strT), context.getResources().getString(2132019978)}), "\n\n", null, null, 0, null, null, 62, null)).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: UO6.Zs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                P.nr(dialogInterface, i5);
            }
        }).create().show();
    }
}
