package com.alightcreative.app.motion.activities;

import QmE.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.account.CloudBenefitValues;
import com.alightcreative.account.LicenseInfo;
import com.alightcreative.account.LicenseStore;
import com.alightcreative.account.LicenseType;
import com.alightcreative.account.PurchasePeriod;
import com.alightcreative.app.motion.activities.VCI;
import com.safedk.android.utils.Logger;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class VCI extends RecyclerView.Adapter {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f44794O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.alightcreative.account.o f44795n;
    private final kgE.fuX nr;
    private final QmE.iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nYs.Ml f44796t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f44797n;
        final /* synthetic */ VCI rl;

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.VCI$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0623j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;

            static {
                int[] iArr = new int[PurchasePeriod.Unit.values().length];
                try {
                    iArr[PurchasePeriod.Unit.Year.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PurchasePeriod.Unit.Month.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PurchasePeriod.Unit.Week.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PurchasePeriod.Unit.Day.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PurchasePeriod.Unit.Hour.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PurchasePeriod.Unit.Minute.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LicenseType.values().length];
                try {
                    iArr2[LicenseType.Promotional.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[LicenseType.Subscription.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[LicenseType.Pass.ordinal()] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[kgE.K.values().length];
                try {
                    iArr3[kgE.K.f70079o.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[kgE.K.f70076Z.ordinal()] = 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[kgE.K.f70072S.ordinal()] = 3;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[kgE.K.f70077e.ordinal()] = 4;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[kgE.K.E2.ordinal()] = 5;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[kgE.K.f70078g.ordinal()] = 6;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[kgE.K.f70075X.ordinal()] = 7;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr3[kgE.K.f70073T.ordinal()] = 8;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr3[kgE.K.f70070N.ordinal()] = 9;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr3[kgE.K.f70081v.ordinal()] = 10;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr3[kgE.K.Xw.ordinal()] = 11;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[LicenseStore.values().length];
                try {
                    iArr4[LicenseStore.GooglePlayStore.ordinal()] = 1;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr4[LicenseStore.AppleAppStore.ordinal()] = 2;
                } catch (NoSuchFieldError unused22) {
                }
                $EnumSwitchMapping$3 = iArr4;
            }
        }

        public static void safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(Context p0, Intent p1, Bundle p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/core/content/ContextCompat;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V");
            if (p1 == null) {
                return;
            }
            ContextCompat.startActivity(p0, p1, p2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:112:0x040a  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x041c  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x02ba A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01f8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void J2(final MEJ card) {
            String string;
            Long lValueOf;
            String string2;
            int i2;
            Intrinsics.checkNotNullParameter(card, "card");
            ViewBinding viewBinding = this.f44797n;
            Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.MyaccountLicenseCardBinding");
            if (card.n() == null) {
                ((SJ0.l) this.f44797n).J2.setVisibility(8);
                if (this.rl.HI().O().isEmpty()) {
                    ((SJ0.l) this.f44797n).f9511O.setText(2132019732);
                    ((SJ0.l) this.f44797n).rl.setText(2132019731);
                } else {
                    ((SJ0.l) this.f44797n).f9511O.setText(2132019620);
                    ((SJ0.l) this.f44797n).rl.setText(2132019619);
                }
                ((SJ0.l) this.f44797n).f9513t.setVisibility(0);
                ((SJ0.l) this.f44797n).f9513t.setText(2132019615);
                Button button = ((SJ0.l) this.f44797n).f9513t;
                final VCI vci = this.rl;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.TfQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VCI.j.KN(vci, view);
                    }
                });
                return;
            }
            ((SJ0.l) this.f44797n).f9513t.setVisibility(card.n().getType() == LicenseType.Subscription ? 0 : 8);
            ((SJ0.l) this.f44797n).f9513t.setText(2132019561);
            Button button2 = ((SJ0.l) this.f44797n).f9513t;
            final VCI vci2 = this.rl;
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Dc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VCI.j.Uo(vci2, card, this, view);
                }
            });
            TextView textView = ((SJ0.l) this.f44797n).f9511O;
            int i3 = C0623j.$EnumSwitchMapping$1[card.n().getType().ordinal()];
            if (i3 == 1) {
                string = this.itemView.getContext().getString(2132019994);
            } else if (i3 == 2) {
                PurchasePeriod period = card.n().getPeriod();
                if (period != null) {
                    int i5 = C0623j.$EnumSwitchMapping$0[period.getUnit().ordinal()];
                    string = i5 != 1 ? i5 != 2 ? this.itemView.getResources().getString(2132020268) : this.itemView.getResources().getQuantityString(2131886115, period.getCount(), Integer.valueOf(period.getCount())) : this.itemView.getResources().getQuantityString(2131886119, period.getCount(), Integer.valueOf(period.getCount()));
                } else {
                    string = this.itemView.getResources().getString(2132020268);
                }
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                PurchasePeriod period2 = card.n().getPeriod();
                if (period2 != null) {
                    Resources resources = this.itemView.getResources();
                    switch (C0623j.$EnumSwitchMapping$0[period2.getUnit().ordinal()]) {
                        case 1:
                            i2 = 2131886118;
                            break;
                        case 2:
                            i2 = 2131886114;
                            break;
                        case 3:
                            i2 = 2131886117;
                            break;
                        case 4:
                            i2 = 2131886110;
                            break;
                        case 5:
                            i2 = 2131886112;
                            break;
                        case 6:
                            i2 = 2131886113;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    string = resources.getQuantityString(i2, period2.getCount(), Integer.valueOf(period2.getCount()));
                } else {
                    string = this.itemView.getResources().getString(2132019821);
                }
            }
            textView.setText(string);
            String orderNumber = null;
            if (card.n().getBenefits().contains(kgE.K.Xw)) {
                CloudBenefitValues cloudBenefitValues = (CloudBenefitValues) this.rl.az().Z().getValue();
                lValueOf = cloudBenefitValues != null ? Long.valueOf(cloudBenefitValues.getHighTier()) : null;
            } else if (card.n().getBenefits().contains(kgE.K.f70081v)) {
                CloudBenefitValues cloudBenefitValues2 = (CloudBenefitValues) this.rl.az().Z().getValue();
                if (cloudBenefitValues2 != null) {
                    lValueOf = Long.valueOf(cloudBenefitValues2.getLowTier());
                }
            } else {
                CloudBenefitValues cloudBenefitValues3 = (CloudBenefitValues) this.rl.az().Z().getValue();
                if (cloudBenefitValues3 != null) {
                    lValueOf = Long.valueOf(cloudBenefitValues3.getDefault());
                }
            }
            String strJ2 = HI0.gnv.J2(XFr.j.J2(lValueOf != null ? lValueOf.longValue() : 0L));
            String string3 = this.itemView.getResources().getString(2132017305);
            Set<kgE.K> benefits = card.n().getBenefits();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = benefits.iterator();
            while (it.hasNext()) {
                switch (C0623j.$EnumSwitchMapping$2[((kgE.K) it.next()).ordinal()]) {
                    case 1:
                        string2 = this.itemView.getContext().getString(2132017309);
                        if (string2 != null) {
                            arrayList.add(string2);
                        }
                        break;
                    case 2:
                        string2 = null;
                        if (string2 != null) {
                        }
                        break;
                    case 3:
                        string2 = this.itemView.getContext().getString(2132017306);
                        if (string2 != null) {
                        }
                        break;
                    case 4:
                        string2 = this.itemView.getContext().getString(2132017303);
                        if (string2 != null) {
                        }
                        break;
                    case 5:
                        string2 = this.itemView.getContext().getString(2132017302);
                        if (string2 != null) {
                        }
                        break;
                    case 6:
                        string2 = this.itemView.getContext().getString(2132017308);
                        if (string2 != null) {
                        }
                        break;
                    case 7:
                        string2 = this.itemView.getContext().getString(2132017300);
                        if (string2 != null) {
                        }
                        break;
                    case 8:
                        string2 = this.itemView.getContext().getString(2132017304);
                        if (string2 != null) {
                        }
                        break;
                    case 9:
                        string2 = this.itemView.getContext().getString(2132017301);
                        if (string2 != null) {
                        }
                        break;
                    case 10:
                        string2 = this.itemView.getContext().getString(2132019704, strJ2);
                        if (com.alightcreative.account.C.n(card.n().getBenefits()) > 1) {
                        }
                        if (string2 != null) {
                        }
                        break;
                    case 11:
                        string2 = this.itemView.getContext().getString(2132019704, strJ2);
                        if (string2 != null) {
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            ((SJ0.l) this.f44797n).rl.setText(string3 + "\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null));
            ((SJ0.l) this.f44797n).J2.setVisibility(0);
            String orderNumber2 = card.n().getOrderNumber();
            if (orderNumber2 != null && !StringsKt.isBlank(orderNumber2)) {
                orderNumber = card.n().getOrderNumber();
            }
            String string4 = "";
            if (card.n().getExpires() == null) {
                if (!card.n().getAutoRenewing() || card.n().getType() != LicenseType.Subscription) {
                    ((SJ0.l) this.f44797n).J2.setVisibility(8);
                    return;
                }
                TextView textView2 = ((SJ0.l) this.f44797n).J2;
                int i7 = C0623j.$EnumSwitchMapping$3[card.n().getStore().ordinal()];
                if (i7 == 1) {
                    string4 = this.itemView.getContext().getString(2132020265, orderNumber);
                } else if (i7 == 2) {
                    string4 = this.itemView.getContext().getString(2132020262, orderNumber);
                }
                textView2.setText(string4);
                return;
            }
            String str = DateFormat.getDateInstance(1).format(new Date(card.n().getExpires().longValue()));
            TextView textView3 = ((SJ0.l) this.f44797n).J2;
            int i8 = C0623j.$EnumSwitchMapping$1[card.n().getType().ordinal()];
            if (i8 == 1) {
                string4 = orderNumber == null ? this.itemView.getContext().getString(2132020416, str, orderNumber) : this.itemView.getContext().getString(2132020415, str);
            } else if (i8 != 2) {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (orderNumber == null) {
                }
            } else if (orderNumber != null) {
                if (card.n().getAutoRenewing()) {
                    int i9 = C0623j.$EnumSwitchMapping$3[card.n().getStore().ordinal()];
                    if (i9 == 1) {
                        string4 = this.itemView.getContext().getString(2132020266, orderNumber, str);
                    } else if (i9 == 2) {
                        string4 = this.itemView.getContext().getString(2132020263, orderNumber, str);
                    }
                } else {
                    string4 = this.itemView.getContext().getString(2132020270, orderNumber, str);
                }
            } else if (card.n().getAutoRenewing()) {
                int i10 = C0623j.$EnumSwitchMapping$3[card.n().getStore().ordinal()];
                if (i10 == 1) {
                    string4 = this.itemView.getContext().getString(2132020264, str);
                } else if (i10 == 2) {
                    string4 = this.itemView.getContext().getString(2132020261, str);
                }
            } else {
                string4 = this.itemView.getContext().getString(2132020269, str);
            }
            textView3.setText(string4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(VCI vci, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = vci;
            this.f44797n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(VCI vci, View view) {
            vci.qie().n(j.Y5.f8470n);
            vci.qie().n(new j.fuX("myaccount_click_member_options", null, 2, null));
            vci.ty().invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Uo(VCI vci, MEJ mej, j jVar, View view) {
            vci.qie().n(j.h6y.f8513n);
            if (mej.n().getType() == LicenseType.Subscription) {
                safedk_ContextCompat_startActivity_f482d8446b01c5580049a261a99b538c(jVar.itemView.getContext(), new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + mej.n().getProductId() + "&package=com.alightcreative.motion")), null);
            }
        }
    }

    public VCI(com.alightcreative.account.o purchaseState, QmE.iF eventLogger, nYs.Ml getAlightSettingsUseCase, kgE.fuX iapManager, Function0 onMembershipOptionsTapped) {
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(onMembershipOptionsTapped, "onMembershipOptionsTapped");
        this.f44795n = purchaseState;
        this.rl = eventLogger;
        this.f44796t = getAlightSettingsUseCase;
        this.nr = iapManager;
        this.f44794O = onMembershipOptionsTapped;
        List listO = purchaseState.O();
        List arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(new MEJ((LicenseInfo) it.next()));
        }
        this.J2 = SetsKt.minus(kgE.K.f70071O.n(), (Iterable) this.f44795n.nr()).isEmpty() ? arrayList : CollectionsKt.plus((Collection<? extends MEJ>) arrayList, new MEJ(null, 1, null));
    }

    public final com.alightcreative.account.o HI() {
        return this.f44795n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i2) {
            case 2131558757:
                viewBindingT = SJ0.l.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558758:
                viewBindingT = SJ0.xTb.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return new j(this, viewBindingT);
    }

    public final kgE.fuX az() {
        return this.nr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Ct ct = (Ct) this.J2.get(i2);
        if (!(ct instanceof MEJ)) {
            throw new NoWhenBranchMatchedException();
        }
        holder.J2((MEJ) ct);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.J2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (((Ct) this.J2.get(i2)) instanceof MEJ) {
            return 2131558757;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final QmE.iF qie() {
        return this.rl;
    }

    public final Function0 ty() {
        return this.f44794O;
    }
}
