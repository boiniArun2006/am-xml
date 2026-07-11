package Vi;

import SJ0.Buf;
import Si.Xo;
import Vi.C1479w6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.alightcreative.app.motion.feed.FeedCard;
import com.alightcreative.app.motion.feed.FeedCardButton;
import com.alightcreative.app.motion.feed.FeedCardButtonIcon;
import com.alightcreative.app.motion.feed.FeedCardImage;
import com.alightcreative.app.motion.feed.FeedCardOverlay;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Vi.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class C1479w6 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f11037n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f11038t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f11036O = 8;

    /* JADX INFO: renamed from: Vi.w6$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Vi.w6$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public final class n extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ C1479w6 f11039O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Buf f11040n;
        private boolean nr;
        private final SceneHolder rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Xo f11041t;

        /* JADX INFO: renamed from: Vi.w6$n$j */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[FeedCardOverlay.values().length];
                try {
                    iArr[FeedCardOverlay.none.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FeedCardOverlay.play.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FeedCardButtonIcon.values().length];
                try {
                    iArr2[FeedCardButtonIcon.link.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C1479w6 c1479w6, Buf itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f11039O = c1479w6;
            this.f11040n = itemBinding;
            this.rl = SceneKt.SceneHolder$default(null, 1, null);
            this.nr = true;
        }

        private final Spanned mUb(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, Regex.INSTANCE.fromLiteral("<p>").split(StringsKt.replace$default((String) it.next(), "</p>", "", false, 4, (Object) null), 0));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Html.fromHtml((String) it2.next(), 0));
            }
            ArrayList<Spanned> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                Spanned spanned = (Spanned) obj;
                Intrinsics.checkNotNull(spanned);
                if (!StringsKt.isBlank(spanned)) {
                    arrayList3.add(obj);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z2 = true;
            for (Spanned spanned2 : arrayList3) {
                if (!z2) {
                    String str = HrvQKfmFZJudBc.LOJxKQRe;
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.append(str, new AbsoluteSizeSpan(8, true), 33);
                }
                spannableStringBuilder.append((CharSequence) spanned2);
                z2 = false;
            }
            return spannableStringBuilder;
        }

        public final void HI() {
            Xo xo = this.f11041t;
            if (xo != null) {
                xo.pause();
            }
            Xo xo2 = this.f11041t;
            if (xo2 != null) {
                xo2.release();
            }
            this.f11041t = null;
            this.rl.setScene(SceneKt.getEMPTY_SCENE());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void J2(final FeedCard card) {
            String strReplace$default;
            Intrinsics.checkNotNullParameter(card, "card");
            String str = (com.alightcreative.app.motion.persist.j.INSTANCE.getStagingFeed() && this.f11039O.qie().rl()) ? "https://alight-creative-staging.firebaseapp.com/appdata/am/" : "https://alightcreative.com/appdata/am/";
            ?? r3 = 0;
            this.nr = false;
            int i2 = 1;
            DateFormat dateInstance = DateFormat.getDateInstance(1);
            Date date = new Date(card.getPublishDate());
            String subtitle = card.getSubtitle();
            if (subtitle != null) {
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String strRl = Iy.w6.rl(subtitle, context);
                if (strRl != null) {
                    String str2 = card.getPublishDate() <= 0 ? "" : dateInstance.format(date);
                    Intrinsics.checkNotNull(str2);
                    strReplace$default = StringsKt.replace$default(strRl, "${publishDate}", str2, false, 4, (Object) null);
                } else {
                    strReplace$default = null;
                }
            }
            String title = card.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                this.f11040n.az.setVisibility(8);
            } else {
                this.f11040n.az.setVisibility(0);
                String title2 = card.getTitle();
                Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f11040n.az.setText(xMQ(Iy.w6.rl(title2, context2)));
            }
            List<String> textHtml = card.getTextHtml();
            if (textHtml == null || textHtml.isEmpty()) {
                this.f11040n.qie.setVisibility(8);
            } else {
                this.f11040n.qie.setVisibility(0);
                TextView textView = this.f11040n.qie;
                List<String> textHtml2 = card.getTextHtml();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(textHtml2, 10));
                for (String str3 : textHtml2) {
                    Context context3 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    arrayList.add(Iy.w6.rl(str3, context3));
                }
                textView.setText(mUb(arrayList));
            }
            if (strReplace$default == null || StringsKt.isBlank(strReplace$default)) {
                this.f11040n.gh.setVisibility(8);
            } else {
                this.f11040n.gh.setVisibility(0);
                this.f11040n.gh.setText(Html.fromHtml(strReplace$default, 0));
            }
            FeedCardImage phoneImage = card.getPhoneImage();
            FeedCardOverlay overlay = phoneImage != null ? phoneImage.getOverlay() : null;
            int i3 = -1;
            int i5 = overlay == null ? -1 : j.$EnumSwitchMapping$0[overlay.ordinal()];
            if (i5 == -1 || i5 == 1) {
                this.f11040n.f9089t.setVisibility(4);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f11040n.f9089t.setVisibility(0);
            }
            FeedCardImage phoneImage2 = card.getPhoneImage();
            if ((phoneImage2 != null ? phoneImage2.getAction() : null) != null) {
                View view = this.itemView;
                final C1479w6 c1479w6 = this.f11039O;
                view.setOnClickListener(new View.OnClickListener() { // from class: Vi.Ml
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C1479w6.n.Uo(c1479w6, card, view2);
                    }
                });
            } else {
                this.itemView.setOnClickListener(null);
            }
            this.f11040n.rl.setVisibility(8);
            this.f11040n.mUb.setVisibility(8);
            List<String> effects = card.getEffects();
            if (effects != null && !effects.isEmpty()) {
                this.f11040n.mUb.setVisibility(0);
                this.f11040n.mUb.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
                RecyclerView recyclerView = this.f11040n.mUb;
                List<String> effects2 = card.getEffects();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = effects2.iterator();
                while (it.hasNext()) {
                    VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById((String) it.next());
                    if (visualEffectVisualEffectById != null) {
                        arrayList2.add(visualEffectVisualEffectById);
                    }
                }
                recyclerView.setAdapter(new C1478n(arrayList2, this.f11039O.qie()));
            }
            if (card.getPhoneImage() != null) {
                this.f11040n.rl.setVisibility(0);
                SY6.j jVarBuild = ((Hwc.I28) Hwc.w6.Uo().wTp(str + card.getPhoneImage().getSrc()).nY(true)).build();
                Intrinsics.checkNotNullExpressionValue(jVarBuild, "build(...)");
                this.f11040n.rl.setController(jVarBuild);
                SimpleDraweeView simpleDraweeView = this.f11040n.rl;
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.f35930N = KfLR.vrkoYm + card.getPhoneImage().getWidth() + ":" + card.getPhoneImage().getHeight();
                simpleDraweeView.setLayoutParams(layoutParams2);
            }
            Buf buf = this.f11040n;
            List listListOf = CollectionsKt.listOf((Object[]) new Button[]{buf.nr, buf.f9087O, buf.J2, buf.Uo, buf.KN});
            if (card.getButtons().isEmpty()) {
                this.f11040n.xMQ.setVisibility(8);
                return;
            }
            this.f11040n.xMQ.setVisibility(0);
            final C1479w6 c1479w62 = this.f11039O;
            int i7 = 0;
            for (Object obj : listListOf) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Button button = (Button) obj;
                if (i7 < card.getButtons().size()) {
                    final FeedCardButton feedCardButton = card.getButtons().get(i7);
                    button.setVisibility(r3);
                    FeedCardButtonIcon icon = feedCardButton.getIcon();
                    button.setCompoundDrawablesRelativeWithIntrinsicBounds((icon == null ? i3 : j.$EnumSwitchMapping$1[icon.ordinal()]) == i2 ? ResourcesCompat.J2(this.itemView.getResources(), 2131232069, null) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                    if (StringsKt.startsWith$default(feedCardButton.getLabel(), "@string/cta_", (boolean) r3, 2, (Object) null)) {
                        button.setText(button.getResources().getString(button.getResources().getIdentifier(feedCardButton.getLabel(), "string", button.getContext().getPackageName())));
                    } else {
                        String label = feedCardButton.getLabel();
                        Context context4 = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        button.setText(Iy.w6.rl(label, context4));
                    }
                    button.setOnClickListener(new View.OnClickListener() { // from class: Vi.I28
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C1479w6.n.KN(c1479w62, card, feedCardButton, view2);
                        }
                    });
                } else {
                    button.setVisibility(8);
                }
                i7 = i8;
                r3 = 0;
                i2 = 1;
                i3 = -1;
            }
        }

        public final void az() {
            Xo xo;
            if (!this.nr || (xo = this.f11041t) == null) {
                return;
            }
            xo.nY(true);
        }

        public final void gh() {
            Xo xo = this.f11041t;
            if (xo != null) {
                xo.pause();
            }
        }

        public final void qie() {
            Xo xo = this.f11041t;
            if (xo != null) {
                xo.pause();
            }
        }

        public final void ty() {
            Xo xo = this.f11041t;
            this.f11041t = null;
            if (xo != null) {
                xo.pause();
            }
            if (xo != null) {
                xo.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(C1479w6 c1479w6, FeedCard feedCard, FeedCardButton feedCardButton, View view) {
            c1479w6.az().invoke(feedCard, feedCardButton.getAction());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Uo(C1479w6 c1479w6, FeedCard feedCard, View view) {
            c1479w6.az().invoke(feedCard, feedCard.getPhoneImage().getAction());
        }

        private final Spanned xMQ(String str) {
            return mUb(CollectionsKt.listOf(str));
        }
    }

    public C1479w6(kgE.fuX iapManager, List cards, Function2 onCTAClick) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(onCTAClick, "onCTAClick");
        this.f11037n = iapManager;
        this.rl = cards;
        this.f11038t = onCTAClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public n onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Buf bufT = Buf.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(bufT, "inflate(...)");
        return new n(this, bufT);
    }

    public final Function2 az() {
        return this.f11038t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(n holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.HI();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rl.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        Intrinsics.areEqual(((FeedCard) this.rl.get(i2)).getLayout(), "default");
        return 2131558801;
    }

    public final kgE.fuX qie() {
        return this.f11037n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(n nVar, int i2) {
        Intrinsics.checkNotNullParameter(nVar, qfEYuUHwj.Insrm);
        nVar.J2((FeedCard) this.rl.get(i2));
    }
}
