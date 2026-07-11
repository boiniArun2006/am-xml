package R5;

import R5.I28;
import R5.Ml;
import com.alightcreative.account.IAPItemType;
import com.alightcreative.account.LicenseStore;
import com.alightcreative.account.PurchasePeriod;
import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import f.EnumC1982eO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kgE.Zs;
import kgE.psW;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {
    private static final Ml O(mg4.n nVar, EnumC1982eO enumC1982eO, boolean z2, int i2, int i3, boolean z3, List list, Map map, boolean z4, boolean z5, boolean z6, int i5, boolean z7, I28 i28, PlayfulUnlockStyle playfulUnlockStyle, boolean z9, boolean z10, boolean z11) {
        CN3 cn3;
        psW psw;
        boolean z12;
        boolean z13;
        int i7;
        Map map2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        I28 i282;
        int i8;
        mg4.j jVar;
        kgE.j jVarO;
        Ml ml = z4 ? Ml.w6.f8669n : Ml.n.f8668n;
        if (!nVar.rl().isEmpty()) {
            int i9 = 10;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    CN3 cn32 = new CN3(linkedHashMap);
                    switch (enumC1982eO == null ? -1 : C0298j.$EnumSwitchMapping$1[enumC1982eO.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            psW pswT = nVar.t();
                            psW psw2 = (pswT != null && pswT.J2() == LicenseStore.GooglePlayStore && pswT.n() == IAPItemType.Subscription) ? pswT : null;
                            EnumC1982eO enumC1982eOT = t(enumC1982eO, nVar.rl().gh().size() > 1);
                            if (nVar.nr() != null) {
                                cn3 = cn32;
                                psw = psw2;
                                z12 = true;
                            } else {
                                cn3 = cn32;
                                psw = psw2;
                                z12 = false;
                            }
                            return new Ml.j.C0297j(cn3, psw, enumC1982eOT, z2, i2, i3, z12, z4, z5, list, map, z6 && enumC1982eO == EnumC1982eO.f64023o, z9, z11);
                        case 5:
                            List listQie = cn32.qie();
                            boolean z18 = nVar.nr() != null;
                            XFr.j jVar2 = (XFr.j) map.get(mg4.w6.f70998t);
                            return new Ml.j.n(listQie, i2, z18, z4, jVar2 != null ? jVar2.HI() : XFr.j.f11812t.n(100.0d), i5, z7, null);
                        case 6:
                            List listQie2 = cn32.qie();
                            boolean z19 = nVar.nr() != null;
                            XFr.j jVar3 = (XFr.j) map.get(mg4.w6.f70998t);
                            return new Ml.j.w6(listQie2, i2, z19, z4, jVar3 != null ? jVar3.HI() : XFr.j.f11812t.n(100.0d), null);
                        case 7:
                            boolean z20 = nVar.nr() != null;
                            I28 i283 = i28 == null ? I28.j.f8646n : i28;
                            if (z11 && (playfulUnlockStyle == PlayfulUnlockStyle.CARDS_HORIZONTAL || playfulUnlockStyle == PlayfulUnlockStyle.CARDS_VERTICAL)) {
                                z13 = true;
                                i7 = i3;
                                map2 = map;
                                z14 = z4;
                                z15 = z7;
                                z17 = z10;
                                i282 = i283;
                                i8 = i2;
                                z16 = z9;
                            } else {
                                z13 = false;
                                i7 = i3;
                                map2 = map;
                                z14 = z4;
                                z15 = z7;
                                z16 = z9;
                                z17 = z10;
                                i282 = i283;
                                i8 = i2;
                            }
                            return new Ml.j.C0296Ml(cn32, i8, i7, list, z20, z14, z15, i282, playfulUnlockStyle, z16, z17, map2, z13);
                        default:
                            return new Ml.j.I28(cn32.gh(), t(enumC1982eO, nVar.rl().gh().size() > 1), z2, i2, z3, nVar.nr() != null, z4);
                    }
                }
                Object next = it.next();
                List<mg4.j> list2 = (List) nVar.rl().get((mg4.w6) next);
                if (list2 == null || (jVar = (mg4.j) CollectionsKt.firstOrNull(list2)) == null || (jVarO = jVar.O()) == null) {
                    break;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, i9));
                for (mg4.j jVar4 : list2) {
                    boolean z21 = jVar4.nr() != null;
                    String strJ2 = jVar4.O().J2();
                    long jUo = jVar4.O().Uo();
                    String strKN = jVar4.O().KN();
                    PurchasePeriod purchasePeriodO = jVar4.O().O();
                    kgE.j jVarNr = jVar4.nr();
                    String strJ22 = jVarNr != null ? jVarNr.J2() : null;
                    kgE.j jVarNr2 = jVar4.nr();
                    Long lValueOf = jVarNr2 != null ? Long.valueOf(jVarNr2.Uo()) : null;
                    Integer numN = n(jVarO, jVar4.O());
                    kgE.j jVarNr3 = jVar4.nr();
                    Integer numN2 = jVarNr3 != null ? n(jVar4.O(), jVarNr3) : null;
                    kgE.j jVarT = jVar4.t();
                    arrayList.add(new Wre(strJ2, jUo, strKN, purchasePeriodO, strJ22, lValueOf, numN, numN2, jVarT != null ? Integer.valueOf(jVarT.mUb()) : null, !z21 ? jVar4.O().t() : null, !z21 ? jVar4.O().rl() : null, !z21 ? jVar4.O().n() : null));
                }
                linkedHashMap.put(next, arrayList);
                i9 = 10;
            }
        }
        return ml;
    }

    /* JADX INFO: renamed from: R5.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C0298j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Zs.values().length];
            try {
                iArr[Zs.f70102n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Zs.f70105t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Zs.f70101O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Zs.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC1982eO.values().length];
            try {
                iArr2[EnumC1982eO.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1982eO.f64024r.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1982eO.f64019Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1982eO.f64023o.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1982eO.f64017S.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC1982eO.f64021g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC1982eO.E2.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PurchasePeriod.Unit.values().length];
            try {
                iArr3[PurchasePeriod.Unit.Year.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PurchasePeriod.Unit.Month.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PurchasePeriod.Unit.Week.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PurchasePeriod.Unit.Day.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PurchasePeriod.Unit.Hour.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PurchasePeriod.Unit.Minute.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Integer n(kgE.j baseSubscription, kgE.j compareSubscription) {
        Intrinsics.checkNotNullParameter(baseSubscription, "baseSubscription");
        Intrinsics.checkNotNullParameter(compareSubscription, "compareSubscription");
        long j2 = 100;
        int iUo = (int) (j2 - ((((compareSubscription.Uo() * j2) * ((long) rl(baseSubscription.O()))) / ((long) rl(compareSubscription.O()))) / baseSubscription.Uo()));
        if (5 > iUo || iUo >= 100) {
            return null;
        }
        return Integer.valueOf(iUo);
    }

    public static final Ml nr(w6 w6Var) {
        Ml mlO;
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        mg4.n nVarCk = w6Var.ck();
        if (nVarCk != null) {
            int i2 = C0298j.$EnumSwitchMapping$0[w6Var.ck().O().ordinal()];
            if (i2 == 1 || i2 == 2) {
                mlO = O(nVarCk, w6Var.KN(), w6Var.O(), w6Var.qie(), w6Var.az(), w6Var.t(), w6Var.Ik(), w6Var.HI(), true, w6Var.ty(), w6Var.r(), w6Var.nr(), w6Var.o(), w6Var.xMQ(), w6Var.mUb(), w6Var.Uo(), w6Var.gh(), w6Var.J2());
            } else if (i2 == 3) {
                mlO = Ml.n.f8668n;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                mlO = O(nVarCk, w6Var.KN(), w6Var.O(), w6Var.qie(), w6Var.az(), w6Var.t(), w6Var.Ik(), w6Var.HI(), false, w6Var.ty(), w6Var.r(), w6Var.nr(), w6Var.o(), w6Var.xMQ(), w6Var.mUb(), w6Var.Uo(), w6Var.gh(), w6Var.J2());
            }
            if (mlO != null) {
                return mlO;
            }
        }
        return Ml.w6.f8669n;
    }

    private static final EnumC1982eO t(EnumC1982eO enumC1982eO, boolean z2) {
        if (enumC1982eO != null) {
            if (!z2) {
                enumC1982eO = null;
            }
            if (enumC1982eO != null) {
                return enumC1982eO;
            }
        }
        return EnumC1982eO.f64022n;
    }

    private static final int rl(PurchasePeriod purchasePeriod) {
        int i2;
        int count = purchasePeriod.getCount();
        switch (C0298j.$EnumSwitchMapping$2[purchasePeriod.getUnit().ordinal()]) {
            case 1:
                i2 = 525600;
                break;
            case 2:
                i2 = 43200;
                break;
            case 3:
                i2 = 10080;
                break;
            case 4:
                i2 = 1440;
                break;
            case 5:
                i2 = 60;
                break;
            case 6:
                i2 = 1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return count * i2;
    }
}
