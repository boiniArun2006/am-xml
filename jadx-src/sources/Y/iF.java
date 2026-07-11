package Y;

import Y.iF;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class iF extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function3 f11952O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11953n;
    private final kgE.fuX nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Q.fuX f11954t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.pq f11955n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ iF f11956t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(iF iFVar, SJ0.pq itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f11956t = iFVar;
            this.f11955n = itemBinding;
            this.rl = this.itemView.getContext().getColor(2131099769);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0246  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void J2(final int i2, final VisualEffect effect) {
            final Uri thumbnail;
            Intrinsics.checkNotNullParameter(effect, "effect");
            boolean z2 = this.f11956t.ty().Uo().contains(kgE.K.f70072S) || this.f11956t.az().t(effect.getId());
            this.f11955n.Uo.setVisibility((kgE.Md.n().contains(effect.getId()) && z2) ? 0 : 8);
            this.f11955n.KN.setVisibility((!kgE.Md.n().contains(effect.getId()) || z2) ? 8 : 0);
            this.f11955n.Uo.setImageDrawable(AppCompatResources.rl(this.itemView.getContext(), 2131231824));
            Iy.n localizedStrings = effect.getLocalizedStrings();
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strN = Iy.w6.n(localizedStrings, context, effect.getDesc());
            if (this.f11956t.ck().length() <= 0 || !StringsKt.contains((CharSequence) strN, (CharSequence) this.f11956t.ck(), true)) {
                this.f11955n.f9594t.setText(strN);
            } else {
                ArrayList arrayList = new ArrayList();
                int iIndexOf = -1;
                while (true) {
                    iIndexOf = StringsKt.indexOf((CharSequence) strN, this.f11956t.ck(), iIndexOf + 1, true);
                    if (iIndexOf < 0) {
                        break;
                    } else {
                        arrayList.add(Integer.valueOf(iIndexOf));
                    }
                }
                SpannableString spannableString = new SpannableString(strN);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    spannableString.setSpan(new ForegroundColorSpan(this.rl), iIntValue, this.f11956t.ck().length() + iIntValue, 33);
                }
                this.f11955n.f9594t.setText(spannableString);
            }
            Iy.n localizedStrings2 = effect.getLocalizedStrings();
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String strN2 = Iy.w6.n(localizedStrings2, context2, effect.getName());
            Iy.n localizedStrings3 = effect.getLocalizedStrings();
            Context context3 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Context contextAz = XoT.fuX.az(context3);
            Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
            String strN3 = Iy.w6.n(localizedStrings3, contextAz, effect.getName());
            if (Intrinsics.areEqual(strN2, strN3)) {
                this.f11955n.nr.setVisibility(8);
                this.f11955n.f9594t.setMaxLines(3);
            } else {
                if (this.f11956t.ck().length() <= 0 || !StringsKt.contains((CharSequence) strN3, (CharSequence) this.f11956t.ck(), true)) {
                    this.f11955n.nr.setText(strN3);
                } else {
                    SpannableString spannableString2 = new SpannableString(strN3);
                    int iIndexOf2 = StringsKt.indexOf((CharSequence) strN3, this.f11956t.ck(), 0, true);
                    spannableString2.setSpan(new ForegroundColorSpan(this.rl), iIndexOf2, this.f11956t.ck().length() + iIndexOf2, 33);
                    this.f11955n.nr.setText(spannableString2);
                }
                this.f11955n.nr.setVisibility(0);
                this.f11955n.f9594t.setMaxLines(2);
            }
            if (this.f11956t.ck().length() <= 0 || !StringsKt.contains((CharSequence) strN2, (CharSequence) this.f11956t.ck(), true)) {
                this.f11955n.f9592O.setText(strN2);
            } else {
                SpannableString spannableString3 = new SpannableString(strN2);
                int iIndexOf3 = StringsKt.indexOf((CharSequence) strN2, this.f11956t.ck(), 0, true);
                spannableString3.setSpan(new ForegroundColorSpan(this.rl), iIndexOf3, this.f11956t.ck().length() + iIndexOf3, 33);
                this.f11955n.f9592O.setText(spannableString3);
            }
            Uri thumbnail2 = effect.getThumbnail();
            if (thumbnail2 == null) {
                this.f11955n.mUb.setVisibility(4);
            } else if (Intrinsics.areEqual(thumbnail2.getScheme(), FileUploadManager.f61570h)) {
                List<String> pathSegments = thumbnail2.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                    Uri.Builder builderScheme = thumbnail2.buildUpon().scheme("asset");
                    List<String> pathSegments2 = thumbnail2.getPathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                    thumbnail = builderScheme.path(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null)).build();
                } else {
                    thumbnail = effect.getThumbnail();
                }
                XoT.C.Uo(this, new Function0() { // from class: Y.P
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return iF.j.Uo(effect, thumbnail);
                    }
                });
                this.f11955n.mUb.setVisibility(0);
                SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().rl(thumbnail).nY(true)).build();
                Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                this.f11955n.mUb.setController(jVarBuild);
            }
            View view = this.itemView;
            final iF iFVar = this.f11956t;
            view.setOnClickListener(new View.OnClickListener() { // from class: Y.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    iF.j.KN(iFVar, i2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(iF iFVar, int i2, View view) {
            Function3 function3Qie = iFVar.qie();
            if (function3Qie != null) {
                function3Qie.invoke(iFVar.HI(), Integer.valueOf(i2), "search");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(VisualEffect visualEffect, Uri uri) {
            return "FXThumbnail: " + visualEffect.getThumbnail() + " -> " + uri;
        }
    }

    public iF(List list, String searchText, Q.fuX featureUnlockManager, kgE.fuX iapManager, Function3 function3) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(featureUnlockManager, "featureUnlockManager");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f11953n = list;
        this.rl = searchText;
        this.f11954t = featureUnlockManager;
        this.nr = iapManager;
        this.f11952O = function3;
    }

    public final List HI() {
        return this.f11953n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.J2(i2, (VisualEffect) this.f11953n.get(i2));
    }

    public final Q.fuX az() {
        return this.f11954t;
    }

    public final String ck() {
        return this.rl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f11953n.size();
    }

    public final Function3 qie() {
        return this.f11952O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.pq pqVarT = SJ0.pq.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(pqVarT, "inflate(...)");
        return new j(this, pqVarT);
    }

    public final kgE.fuX ty() {
        return this.nr;
    }
}
