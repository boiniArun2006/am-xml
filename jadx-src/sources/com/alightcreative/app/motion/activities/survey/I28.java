package com.alightcreative.app.motion.activities.survey;

import Nh.fuX;
import Nh.j;
import QmE.iF;
import QmE.j;
import androidx.media3.database.Kr.FlTC;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import com.alightcreative.app.motion.activities.survey.n;
import i.C2165Ml;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 extends uW.w6 {
    private final iF KN;
    private final String Uo;
    private final List xMQ;
    public static final j mUb = new j(null);
    public static final int gh = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.survey.I28$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public static final class C0643j implements ViewModelProvider.Factory {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f45657O;
            final /* synthetic */ C2165Ml nr;
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Nh.Ml f45658t;

            C0643j(n nVar, Nh.Ml ml, C2165Ml c2165Ml, String str) {
                this.rl = nVar;
                this.f45658t = ml;
                this.nr = c2165Ml;
                this.f45657O = str;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                I28 i28N = this.rl.n(this.f45658t, this.nr, this.f45657O);
                Intrinsics.checkNotNull(i28N, "null cannot be cast to non-null type T of com.alightcreative.app.motion.activities.survey.SurveyViewModel.Companion.provideFactory.<no name provided>.create");
                return i28N;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, Nh.Ml survey, C2165Ml localization, String str) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(survey, "survey");
            Intrinsics.checkNotNullParameter(localization, "localization");
            Intrinsics.checkNotNullParameter(str, FlTC.yqTcfyM);
            return new C0643j(assistedFactory, survey, localization, str);
        }
    }

    public interface n {
        I28 n(Nh.Ml ml, C2165Ml c2165Ml, String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I28(Nh.Ml survey, C2165Ml localization, String hook, iF eventLogger) {
        super(new Function1() { // from class: ID.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.app.motion.activities.survey.I28.az((Wre) obj);
            }
        });
        Intrinsics.checkNotNullParameter(survey, "survey");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.Uo = hook;
        this.KN = eventLogger;
        C2169w6 c2169w6T = Iy.j.t(Iy.j.f4399n, localization, null, 2, null);
        c2169w6T = c2169w6T == null ? C2169w6.rl.n() : c2169w6T;
        List listN = survey.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(fuX.n((Nh.CN3) it.next(), c2169w6T));
        }
        this.xMQ = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CN3 az(ID.Wre it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Wre.n(it);
    }

    public final void Ik() {
        this.KN.n(new j.ZhI(this.Uo));
        xMQ(n.C0645n.f45668n);
    }

    @Override // uW.w6
    public void Uo() {
        mUb(new ID.Wre(this.xMQ, 0, CollectionsKt.listOfNotNull(CollectionsKt.firstOrNull(this.xMQ)), MapsKt.emptyMap()));
        this.KN.n(new j.Fo(this.Uo));
    }

    public final void r(String id, String value) {
        Integer numQie;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        ID.Wre wre = (ID.Wre) nr();
        if (wre == null || (numQie = wre.qie()) == null) {
            return;
        }
        int iIntValue = numQie.intValue();
        List listT = wre.t();
        if ((listT != null ? (Nh.j) CollectionsKt.getOrNull(listT, iIntValue) : null) instanceof j.n) {
            Map mutableMap = MapsKt.toMutableMap(wre.J2());
            mutableMap.put(id, value);
            Unit unit = Unit.INSTANCE;
            mUb(ID.Wre.rl(wre, null, 0, null, mutableMap, 7, null));
        }
    }

    public final void HI() {
        int i2;
        int iMUb;
        ID.Wre wre = (ID.Wre) nr();
        if (wre == null) {
            return;
        }
        Nh.n nVarNr = wre.nr();
        if (!(nVarNr instanceof j.n) && !(nVarNr instanceof j.w6)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (wre.KN().size() > i2) {
            List listDropLast = CollectionsKt.dropLast(wre.KN(), i2);
            if (wre.nr() instanceof Nh.w6) {
                iMUb = wre.mUb() - 1;
            } else {
                iMUb = wre.mUb();
            }
            mUb(ID.Wre.rl(wre, null, iMUb, listDropLast, null, 9, null));
        }
        this.KN.n(new j.fhj(this.Uo));
    }

    public final void ck() {
        Integer numQie;
        Nh.j jVar;
        ID.Wre wre = (ID.Wre) nr();
        if (wre != null && (numQie = wre.qie()) != null) {
            int iIntValue = numQie.intValue();
            List listT = wre.t();
            String str = null;
            if (listT != null) {
                jVar = (Nh.j) CollectionsKt.getOrNull(listT, iIntValue);
            } else {
                jVar = null;
            }
            if (jVar != null) {
                iF iFVar = this.KN;
                String str2 = this.Uo;
                String id = jVar.getId();
                if ((jVar instanceof j.n) && (str = (String) wre.J2().get(((j.n) jVar).getId())) == null) {
                    str = "";
                }
                iFVar.n(new j.yht(str2, id, str));
                if (wre.mUb() == wre.gh().size() - 1) {
                    xMQ(n.j.f45667n);
                } else {
                    mUb(ID.Wre.rl(wre, null, wre.mUb() + 1, CollectionsKt.plus((Collection<? extends Object>) wre.KN(), this.xMQ.get(wre.mUb() + 1)), null, 9, null));
                }
            }
        }
    }

    public final void ty(int i2) {
        List listT;
        Nh.j jVar;
        ID.Wre wre = (ID.Wre) nr();
        if (wre != null) {
            Integer numQie = wre.qie();
            if ((numQie == null || numQie.intValue() != i2) && (listT = wre.t()) != null && (jVar = (Nh.j) CollectionsKt.getOrNull(listT, i2)) != null) {
                Nh.n nVarNr = wre.nr();
                if (!(nVarNr instanceof j.n) && !(nVarNr instanceof j.w6)) {
                    mUb(ID.Wre.rl(wre, null, 0, CollectionsKt.plus((Collection<? extends Nh.j>) wre.KN(), jVar), null, 11, null));
                } else {
                    mUb(ID.Wre.rl(wre, null, 0, CollectionsKt.plus((Collection<? extends Nh.j>) CollectionsKt.dropLast(wre.KN(), 1), jVar), null, 11, null));
                }
                this.KN.n(new j.ZX7(this.Uo, jVar.getId()));
            }
        }
    }
}
