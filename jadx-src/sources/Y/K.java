package Y;

import Y.K;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class K extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function2 f11855O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11856n;
    private final kgE.fuX nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Q.fuX f11857t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.QaP f11858n;
        final /* synthetic */ K rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(K k2, SJ0.QaP itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = k2;
            this.f11858n = itemBinding;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0136  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void O(VisualEffect effect, final int i2) {
            Uri thumbnail;
            Intrinsics.checkNotNullParameter(effect, "effect");
            boolean z2 = this.rl.ty().Uo().contains(kgE.K.f70072S) || this.rl.az().t(effect.getId());
            this.f11858n.KN.setVisibility((kgE.Md.n().contains(effect.getId()) && z2) ? 0 : 8);
            this.f11858n.Uo.setVisibility((!kgE.Md.n().contains(effect.getId()) || z2) ? 8 : 0);
            this.f11858n.KN.setImageDrawable(AppCompatResources.rl(this.rl.qie(), 2131231824));
            Iy.n localizedStrings = effect.getLocalizedStrings();
            Context context = this.itemView.getContext();
            String str = jhotmBbwMbr.JMxDBZNARGOaNgB;
            Intrinsics.checkNotNullExpressionValue(context, str);
            String strN = Iy.w6.n(localizedStrings, context, effect.getName());
            Iy.n localizedStrings2 = effect.getLocalizedStrings();
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, str);
            Context contextAz = XoT.fuX.az(context2);
            Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
            String strN2 = Iy.w6.n(localizedStrings2, contextAz, effect.getName());
            effect.getDesc();
            this.f11858n.f9284t.setText(strN);
            if (Intrinsics.areEqual(strN2, strN)) {
                this.f11858n.f9282O.setVisibility(8);
            } else {
                this.f11858n.f9282O.setVisibility(0);
                this.f11858n.f9282O.setText(strN2);
            }
            if (effect.getThumbnail() == null) {
                this.f11858n.nr.setVisibility(4);
            } else if (Intrinsics.areEqual(effect.getThumbnail().getScheme(), FileUploadManager.f61570h)) {
                List<String> pathSegments = effect.getThumbnail().getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                    Uri.Builder builderScheme = effect.getThumbnail().buildUpon().scheme("asset");
                    List<String> pathSegments2 = effect.getThumbnail().getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                    thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
                } else {
                    thumbnail = effect.getThumbnail();
                }
                this.f11858n.nr.setVisibility(0);
                SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
                Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                this.f11858n.nr.setController(jVarBuild);
            }
            View view = this.itemView;
            final K k2 = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    K.j.J2(k2, i2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(K k2, int i2, View view) {
            Function2 function2HI = k2.HI();
            if (function2HI != null) {
                function2HI.invoke(Integer.valueOf(i2), "category");
            }
        }
    }

    public K(List list, Context context, Q.fuX featureUnlockManager, kgE.fuX iapManager, Function2 function2) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f11856n = list;
        this.rl = context;
        this.f11857t = featureUnlockManager;
        this.nr = iapManager;
        this.f11855O = function2;
    }

    public final Function2 HI() {
        return this.f11855O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.QaP qaPT = SJ0.QaP.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(qaPT, "inflate(...)");
        return new j(this, qaPT);
    }

    public final Q.fuX az() {
        return this.f11857t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((VisualEffect) this.f11856n.get(i2), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11856n.size();
    }

    public final Context qie() {
        return this.rl;
    }

    public final kgE.fuX ty() {
        return this.nr;
    }
}
