package cd;

import android.R;
import android.content.DialogInterface;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import ep.oxM.esLNYym;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class nKK {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void O(MyAccountActivity myAccountActivity, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function03 = new Function0() { // from class: cd.afx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return nKK.J2();
                }
            };
        }
        nr(myAccountActivity, function0, function02, function03);
    }

    public static final void nr(MyAccountActivity myAccountActivity, Function0 onSubscriptionLinkClicked, Function0 onPlayStoreLinkClicked, final Function0 onDialogDismissed) {
        TextView textView;
        SpannedString spannedStringGh;
        SpannedString spannedStringGh2;
        Intrinsics.checkNotNullParameter(myAccountActivity, esLNYym.KvpPwPUip);
        Intrinsics.checkNotNullParameter(onSubscriptionLinkClicked, "onSubscriptionLinkClicked");
        Intrinsics.checkNotNullParameter(onPlayStoreLinkClicked, "onPlayStoreLinkClicked");
        Intrinsics.checkNotNullParameter(onDialogDismissed, "onDialogDismissed");
        String string = myAccountActivity.getString(2132020272);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannedString spannedStringValueOf = SpannedString.valueOf(string);
        AlertDialog alertDialogXQ = new AlertDialog.Builder(myAccountActivity).KN((spannedStringValueOf == null || (spannedStringGh = eVj.CN3.gh(spannedStringValueOf, "subLink", new eVj.j(true, false, false, null, onSubscriptionLinkClicked, 14, null))) == null || (spannedStringGh2 = eVj.CN3.gh(spannedStringGh, "playStoreLink", new eVj.j(true, false, false, null, onPlayStoreLinkClicked, 14, null))) == null) ? null : eVj.CN3.gh(spannedStringGh2, TtmlNode.BOLD, new eVj.j(false, true, false, null, null, 29, null))).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: cd.Z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                nKK.Uo(onDialogDismissed, dialogInterface, i2);
            }
        }).ty(new DialogInterface.OnDismissListener() { // from class: cd.Ew
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                nKK.KN(onDialogDismissed, dialogInterface);
            }
        }).XQ();
        if (alertDialogXQ == null || (textView = (TextView) alertDialogXQ.findViewById(R.id.message)) == null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(Function0 function0, DialogInterface dialogInterface, int i2) {
        function0.invoke();
    }
}
