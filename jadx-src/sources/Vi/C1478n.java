package Vi;

import SJ0.s6u;
import XoT.C;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Iterator;
import java.util.List;
import kgE.Md;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yc.DT;
import yc.S;

/* JADX INFO: renamed from: Vi.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class C1478n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11034n;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: Vi.n$j */
    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final s6u f11035n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(s6u itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f11035n = itemBinding;
        }

        public final s6u nr() {
            return this.f11035n;
        }
    }

    public C1478n(List effects, kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f11034n = effects;
        this.rl = iapManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        s6u s6uVarT = s6u.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(s6uVarT, "inflate(...)");
        return new j(s6uVarT);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(j holder, int i2) {
        Object next;
        final Uri thumbnail;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final VisualEffect visualEffect = (VisualEffect) this.f11034n.get(i2);
        holder.nr().J2.setVisibility(Md.n().contains(visualEffect.getId()) ? 0 : 8);
        TextView textView = holder.nr().f9634O;
        Iy.n localizedStrings = visualEffect.getLocalizedStrings();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(Iy.w6.n(localizedStrings, context, visualEffect.getName()));
        TextView textView2 = holder.nr().nr;
        Iy.n localizedStrings2 = visualEffect.getLocalizedStrings();
        Context context2 = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView2.setText(Iy.w6.n(localizedStrings2, context2, visualEffect.getDesc()));
        Iterator it = DT.E2().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            S s2 = (S) next;
            if (s2.n() != 1 && ((Boolean) s2.rl().invoke(visualEffect, null, Boolean.valueOf(this.rl.rl()))).booleanValue()) {
                break;
            }
        }
        S s3 = (S) next;
        Integer numValueOf = s3 != null ? Integer.valueOf(s3.t()) : null;
        if (numValueOf == null) {
            holder.nr().f9636t.setText("?");
        } else {
            holder.nr().f9636t.setText(numValueOf.intValue());
        }
        if (visualEffect.getThumbnail() == null) {
            holder.nr().Uo.setVisibility(8);
            return;
        }
        if (Intrinsics.areEqual(visualEffect.getThumbnail().getScheme(), FileUploadManager.f61570h)) {
            List<String> pathSegments = visualEffect.getThumbnail().getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                Uri.Builder builderScheme = visualEffect.getThumbnail().buildUpon().scheme("asset");
                List<String> pathSegments2 = visualEffect.getThumbnail().getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
            } else {
                thumbnail = visualEffect.getThumbnail();
            }
        }
        C.Uo(this, new Function0() { // from class: Vi.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1478n.ty(visualEffect, thumbnail);
            }
        });
        holder.nr().Uo.setVisibility(0);
        SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
        Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
        holder.nr().Uo.setController(jVarBuild);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11034n.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty(VisualEffect visualEffect, Uri uri) {
        return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
    }
}
