package KC;

import QmE.j;
import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.alightcreative.app.motion.persist.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class nr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final QmE.iF iFVar, final Activity activity, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.fuX(QiDPjiOCZHDS.ldX, null, 2, null));
        com.alightcreative.app.motion.persist.j.INSTANCE.setReviewPopupResponse(j.C.f45811r);
        iFVar.n(new j.fuX("review2_popup_enjoy_yes", null, 2, null));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).o(2132020322).Uo(2132020064).setPositiveButton(2132019776, new DialogInterface.OnClickListener() { // from class: KC.nH
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                nr.xMQ(iFVar, activity, dialogInterface2, i3);
            }
        }).setNegativeButton(2132019740, new DialogInterface.OnClickListener() { // from class: KC.Lc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                nr.mUb(iFVar, dialogInterface2, i3);
            }
        }).az(new DialogInterface.OnCancelListener() { // from class: KC.Kk1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface2) {
                nr.gh(iFVar, dialogInterface2);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        alertDialogCreate.show();
        View viewFindViewById = alertDialogCreate.findViewById(R.id.message);
        Intrinsics.checkNotNull(viewFindViewById);
        TextView textView = (TextView) viewFindViewById;
        Linkify.addLinks(textView, 2);
        textView.setLinkTextColor(activity.getColor(2131099860));
    }

    public static final void Uo(final Activity activity, FZ.n nVar, final QmE.iF eventLogger) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getReviewPopupResponse() != j.C.f45809n || jVar.getProjectsShared() < 5) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("export_count", jVar.getProjectsExported());
        bundle.putInt("share_count", jVar.getProjectsShared());
        bundle.putInt("create_count", jVar.getProjectsCreated());
        Unit unit = Unit.INSTANCE;
        eventLogger.n(new j.fuX("review2_popup_show", bundle));
        new AlertDialog.Builder(activity).o(2132020065).setPositiveButton(2132020455, new DialogInterface.OnClickListener() { // from class: KC.Buf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                nr.KN(eventLogger, activity, dialogInterface, i2);
            }
        }).setNegativeButton(2132019751, new DialogInterface.OnClickListener() { // from class: KC.MKd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                nr.qie(eventLogger, dialogInterface, i2);
            }
        }).az(new DialogInterface.OnCancelListener() { // from class: KC.ya
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                nr.az(eventLogger, dialogInterface);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(QmE.iF iFVar, DialogInterface dialogInterface) {
        iFVar.n(new j.fuX("review2_popup_cancel", null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(QmE.iF iFVar, DialogInterface dialogInterface) {
        iFVar.n(new j.fuX("review2_popup_rate_cancel", null, 2, null));
        com.alightcreative.app.motion.persist.j.INSTANCE.setReviewPopupResponse(j.C.f45811r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(QmE.iF iFVar, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.fuX("review2_popup_rate_no", null, 2, null));
        com.alightcreative.app.motion.persist.j.INSTANCE.setReviewPopupResponse(j.C.f45810o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(QmE.iF iFVar, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.fuX("review2_popup_enjoy_notreally", null, 2, null));
        com.alightcreative.app.motion.persist.j.INSTANCE.setReviewPopupResponse(j.C.f45807Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(QmE.iF iFVar, Activity activity, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.fuX("review2_popup_rate_yes", null, 2, null));
        com.alightcreative.app.motion.persist.j.INSTANCE.setReviewPopupResponse(j.C.f45805O);
        ot.j.rl(activity);
    }
}
