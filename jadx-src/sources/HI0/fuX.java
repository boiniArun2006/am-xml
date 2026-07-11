package HI0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class fuX {
    public static final void J2(Activity activity, String str, String str2, List extraButtons) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(extraButtons, "extraButtons");
        if (str == null && str2 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (str != null) {
            builder.setTitle(str);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        mUb(builder, extraButtons);
    }

    public static final void KN(Fragment fragment, String str, String str2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (str == null && str2 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (str != null) {
            builder.setTitle(str);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        gh(builder, null, 1, null);
    }

    public static final void O(Activity activity, int i2, String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (i2 == 0 && str == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (i2 != 0) {
            builder.setTitle(i2);
        }
        if (str != null) {
            builder.setMessage(str);
        }
        gh(builder, null, 1, null);
    }

    public static final void Uo(Fragment fragment, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (i2 != 0) {
            builder.setTitle(i2);
        }
        if (i3 != 0) {
            builder.setMessage(i3);
        }
        gh(builder, null, 1, null);
    }

    public static /* synthetic */ void gh(AlertDialog.Builder builder, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        mUb(builder, list);
    }

    public static final void mUb(AlertDialog.Builder builder, final List extraButtons) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(extraButtons, "extraButtons");
        builder.setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: HI0.I28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                fuX.qie(dialogInterface, i2);
            }
        });
        if (!extraButtons.isEmpty()) {
            builder.setNeutralButton((CharSequence) ((Pair) extraButtons.get(0)).getFirst(), new DialogInterface.OnClickListener() { // from class: HI0.Wre
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    fuX.az(extraButtons, dialogInterface, i2);
                }
            });
        }
        if (extraButtons.size() >= 2) {
            builder.setNegativeButton((CharSequence) ((Pair) extraButtons.get(1)).getFirst(), new DialogInterface.OnClickListener() { // from class: HI0.CN3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    fuX.ty(extraButtons, dialogInterface, i2);
                }
            });
        }
        if (extraButtons.size() >= 3) {
            throw new IllegalArgumentException();
        }
        builder.create().show();
    }

    public static final void nr(Activity activity, int i2, int i3) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (i2 == 0 && i3 == 0) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (i2 != 0) {
            builder.setTitle(i2);
        }
        if (i3 != 0) {
            builder.setMessage(i3);
        }
        gh(builder, null, 1, null);
    }

    public static /* synthetic */ void xMQ(Activity activity, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        J2(activity, str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(List list, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        ((Function0) ((Pair) list.get(0)).getSecond()).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(List list, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        ((Function0) ((Pair) list.get(1)).getSecond()).invoke();
    }
}
