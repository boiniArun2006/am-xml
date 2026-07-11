package Y;

import Y.Zs;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Zs extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11934n;
    private final kgE.fuX nr;
    private final Q.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function3 f11935t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.R6 f11936n;
        final /* synthetic */ Zs rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Zs zs, SJ0.R6 itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = zs;
            this.f11936n = itemBinding;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void J2(final int i2, final VisualEffect effect) {
            final Uri thumbnail;
            Intrinsics.checkNotNullParameter(effect, "effect");
            boolean z2 = this.rl.nr.Uo().contains(kgE.K.f70072S) || this.rl.rl.t(effect.getId());
            int i3 = 8;
            this.f11936n.f9289O.setVisibility((kgE.Md.n().contains(effect.getId()) && z2) ? 0 : 8);
            AppCompatImageView appCompatImageView = this.f11936n.nr;
            if (kgE.Md.n().contains(effect.getId()) && !z2) {
                i3 = 0;
            }
            appCompatImageView.setVisibility(i3);
            this.f11936n.f9289O.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231824));
            Iy.n localizedStrings = effect.getLocalizedStrings();
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f11936n.J2.setText(Iy.w6.n(localizedStrings, context, effect.getName()));
            if (effect.getThumbnail() == null) {
                this.f11936n.f9291t.setVisibility(4);
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
                XoT.C.Uo(this, new Function0() { // from class: Y.psW
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Zs.j.Uo(effect, thumbnail);
                    }
                });
                this.f11936n.f9291t.setVisibility(0);
                SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
                Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                this.f11936n.f9291t.setController(jVarBuild);
            }
            View view = this.itemView;
            final Zs zs = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.Md
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Zs.j.KN(zs, i2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(Zs zs, int i2, View view) {
            Function3 function3 = zs.f11935t;
            if (function3 != null) {
                function3.invoke(zs.f11934n, Integer.valueOf(i2), "recommend");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(VisualEffect visualEffect, Uri uri) {
            return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
        }
    }

    public Zs(List list, Q.fuX featureUnlockManager, Function3 function3, kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f11934n = list;
        this.rl = featureUnlockManager;
        this.f11935t = function3;
        this.nr = iapManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.R6 r6T = SJ0.R6.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(r6T, "inflate(...)");
        return new j(this, r6T);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.J2(i2, (VisualEffect) this.f11934n.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11934n.size();
    }
}
