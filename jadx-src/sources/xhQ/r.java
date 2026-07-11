package xhQ;

import SJ0.eh;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.easing.EasingKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.List;
import kgE.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xhQ.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f75469n = CollectionsKt.emptyList();

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final eh f75470n;
        final /* synthetic */ r rl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, eh itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = rVar;
            this.f75470n = itemBinding;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void O(CN3 item) {
            final Uri thumbnail;
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof n) {
                final VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(((n) item).nr());
                if ((visualEffectVisualEffectById != null ? visualEffectVisualEffectById.getThumbnail() : null) == null) {
                    this.f75470n.J2.setVisibility(8);
                } else if (Intrinsics.areEqual(visualEffectVisualEffectById.getThumbnail().getScheme(), FileUploadManager.f61570h)) {
                    List<String> pathSegments = visualEffectVisualEffectById.getThumbnail().getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                    if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                        Uri.Builder builderScheme = visualEffectVisualEffectById.getThumbnail().buildUpon().scheme("asset");
                        List<String> pathSegments2 = visualEffectVisualEffectById.getThumbnail().getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                        thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
                    } else {
                        thumbnail = visualEffectVisualEffectById.getThumbnail();
                    }
                    XoT.C.Uo(this, new Function0() { // from class: xhQ.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return r.j.J2(visualEffectVisualEffectById, thumbnail);
                        }
                    });
                    this.f75470n.J2.setVisibility(0);
                    SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
                    Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                    this.f75470n.J2.setController(jVarBuild);
                    TextView textView = this.f75470n.nr;
                    Iy.n localizedStrings = visualEffectVisualEffectById.getLocalizedStrings();
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    textView.setText(Iy.w6.n(localizedStrings, context, visualEffectVisualEffectById.getName()));
                    this.f75470n.J2.setVisibility(0);
                }
                this.f75470n.rl.setVisibility(8);
            } else if (item instanceof xhQ.j) {
                xhQ.j jVar = (xhQ.j) item;
                this.f75470n.nr.setText(this.itemView.getResources().getString(EasingKt.getLabelResource(jVar.nr())));
                this.f75470n.rl.setImageDrawable(ResourcesCompat.J2(this.itemView.getResources(), EasingKt.getIcon(jVar.nr()), this.itemView.getContext().getTheme()));
                this.f75470n.rl.setImageTintList(ColorStateList.valueOf(this.itemView.getResources().getColor(2131099769, this.itemView.getContext().getTheme())));
                this.f75470n.rl.setVisibility(0);
                this.f75470n.J2.setVisibility(8);
            } else {
                if (!(item instanceof w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                w6 w6Var = (w6) item;
                this.f75470n.nr.setText(this.itemView.getResources().getString(w6Var.rl() == K.f70073T ? 2132019459 : 2132017392));
                this.f75470n.rl.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), w6Var.nr()));
                this.f75470n.rl.setImageTintList(null);
                this.f75470n.rl.setVisibility(0);
                this.f75470n.J2.setVisibility(8);
            }
            this.f75470n.f9433O.setText(item.n());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String J2(VisualEffect visualEffect, Uri uri) {
            return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        eh ehVarT = eh.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ehVarT, "inflate(...)");
        return new j(this, ehVarT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75469n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O((CN3) this.f75469n.get(i2));
    }

    public final void ty(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f75469n = items;
        notifyDataSetChanged();
    }
}
