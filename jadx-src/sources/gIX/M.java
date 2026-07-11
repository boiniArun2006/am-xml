package gIX;

import QmE.iF;
import QmE.j;
import SJ0.Lc;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.SaveToStorageActivity;
import com.safedk.android.utils.Logger;
import gIX.M;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class M extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f67224O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f67225n;
    private final List nr;
    private final Activity rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f67226t;

    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lc f67227n;
        private final List nr;
        private final iF rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f67228t;

        public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Lc itemBinding, iF eventLogger, List selectedProjectIds, List snapshots) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(selectedProjectIds, "selectedProjectIds");
            Intrinsics.checkNotNullParameter(snapshots, "snapshots");
            this.f67227n = itemBinding;
            this.rl = eventLogger;
            this.f67228t = selectedProjectIds;
            this.nr = snapshots;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(j jVar, final Z z2, final Activity activity, View view) {
            Activity activity2;
            int i2 = 0;
            for (Object obj : jVar.f67228t) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                rWZ.n nVar = (rWZ.n) CollectionsKt.getOrNull(jVar.nr, i2);
                if (nVar != null) {
                    jVar.rl.n(new j.Lc(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(z2.nr()), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
                }
                i2 = i3;
            }
            if (z2.nr() == DAz.f67201n) {
                com.alightcreative.share.j.ViF(activity, z2.t(), activity.getResources().getText(2132020152).toString(), jVar.rl, Ken.n.f5626n, null, 16, null);
                return;
            }
            x0X.n nVarN = x0X.w6.n(new Function0() { // from class: gIX.lej
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return M.j.gh(z2, activity);
                }
            });
            boolean z3 = nVarN instanceof n.C1266n;
            if (z3) {
                activity2 = activity;
            } else {
                if (!(nVarN instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Uri uriKN = FileProvider.KN(activity, "com.alightcreative.app.motion.fileprovider", (File) ((n.w6) nVarN).n());
                Intrinsics.checkNotNull(uriKN);
                activity2 = activity;
                com.alightcreative.share.j.fD(activity2, uriKN, "image/jpg", "Share QR Code", jVar.rl, Ken.n.f5626n, null, 32, null);
            }
            if (z3) {
                nKK.aYN(activity2, (Throwable) ((n.C1266n) nVarN).n(), "Export Failed", "Something went wrong while trying to create a JPEG file for sharing.");
            } else if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void qie(j jVar, final Z z2, final Activity activity, int i2, View view) {
            int i3 = 0;
            for (Object obj : jVar.f67228t) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                rWZ.n nVar = (rWZ.n) CollectionsKt.getOrNull(jVar.nr, i3);
                if (nVar != null) {
                    jVar.rl.n(new j.nH(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67202t), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
                }
                i3 = i5;
            }
            x0X.n nVarN = x0X.w6.n(new Function0() { // from class: gIX.iwV
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return M.j.az(z2, activity);
                }
            });
            boolean z3 = nVarN instanceof n.C1266n;
            if (!z3) {
                if (!(nVarN instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                File file = (File) ((n.w6) nVarN).n();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "let(...)");
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) SaveToStorageActivity.class).putExtra("internalPath", file.getAbsolutePath()).putExtra("targetPath", FilesKt.resolve(FilesKt.resolve(externalStoragePublicDirectory, "Alight Motion"), z2.rl() + " [" + System.currentTimeMillis() + "v" + i2 + "].jpg").getAbsolutePath()).putExtra("mimeType", "image/jpg").putExtra("saveCompleteMessage", activity.getResources().getString(2132020095)).putExtra("indexMedia", true).putExtra("projectIds", (String[]) jVar.f67228t.toArray(new String[0])));
            }
            if (z3) {
                nKK.aYN(activity, (Throwable) ((n.C1266n) nVarN).n(), "Export Failed", "Something went wrong while trying to create a JPEG file for saving.");
            } else if (!(nVarN instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ty(j jVar, Activity activity, Z z2, View view) {
            int i2 = 0;
            for (Object obj : jVar.f67228t) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                rWZ.n nVar = (rWZ.n) CollectionsKt.getOrNull(jVar.nr, i2);
                if (nVar != null) {
                    jVar.rl.n(new j.nH(rWZ.n.rl(nVar, 0L, 0L, null, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 0, 0, 0, null, false, null, rWZ.j.Uo(DAz.f67201n), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, -2097153, 31, null)));
                }
                i2 = i3;
            }
            HI0.afx.O(activity).setPrimaryClip(ClipData.newPlainText("Alight Motion Project Link", z2.t()));
            Toast.makeText(activity, 2132017504, 0).show();
        }

        public final void xMQ(final Z item, final Activity activity, final int i2) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f67227n.nr.setImageBitmap(item.n());
            if (item.nr() == DAz.f67202t) {
                this.f67227n.f9197t.setVisibility(0);
                this.f67227n.rl.setVisibility(8);
            } else {
                this.f67227n.f9197t.setVisibility(8);
                this.f67227n.rl.setVisibility(0);
            }
            this.f67227n.f9197t.setOnClickListener(new View.OnClickListener() { // from class: gIX.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    M.j.qie(this.f67449n, item, activity, i2, view);
                }
            });
            this.f67227n.rl.setOnClickListener(new View.OnClickListener() { // from class: gIX.qf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    M.j.ty(this.f67440n, activity, item, view);
                }
            });
            this.f67227n.f9195O.setOnClickListener(new View.OnClickListener() { // from class: gIX.Ln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    M.j.mUb(this.f67220n, item, activity, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File az(Z z2, Activity activity) {
            return nKK.Ik(z2.rl(), z2.n(), activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File gh(Z z2, Activity activity) {
            return nKK.Ik(z2.rl(), z2.n(), activity);
        }
    }

    public M(ArrayList itemList, Activity activity, iF eventLogger, List selectedProjectIds, List snapshots) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(selectedProjectIds, "selectedProjectIds");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        this.f67225n = itemList;
        this.rl = activity;
        this.f67226t = eventLogger;
        this.nr = selectedProjectIds;
        this.f67224O = snapshots;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Lc lcT = Lc.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(lcT, "inflate(...)");
        return new j(lcT, this.f67226t, this.nr, this.f67224O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f67225n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f67225n.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.xMQ((Z) obj, this.rl, i2);
    }
}
