package qE;

import Dk.InterfaceC1335n;
import android.content.Context;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.bendingspoons.concierge.domain.entities.Id;
import com.bendingspoons.oracle.models.IdentityToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;
import qE.SPz;
import qu.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class SPz {

    static final class j implements Q {
        final /* synthetic */ InterfaceC1335n J2;
        final /* synthetic */ WYs.j KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f72236O;
        final /* synthetic */ oh.I28 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fyf.w6 f72237n;
        final /* synthetic */ Dsr.n nr;
        final /* synthetic */ fuX rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ qE.n f72238t;

        static final class n extends ContinuationImpl {
            /* synthetic */ Object E2;
            Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f72239O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            boolean f72240S;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            int f72241X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            Object f72242Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f72244g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f72245n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f72246o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f72247r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f72248t;

            n(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.E2 = obj;
                this.f72241X |= Integer.MIN_VALUE;
                return j.this.n(null, false, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0513  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x014c A[PHI: r1 r4 r8 r9 r10 r11 r12 r13 r14
          0x014c: PHI (r1v20 java.lang.Object) = (r1v19 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r4v14 boolean) = (r4v12 boolean), (r4v15 boolean) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r8v19 boolean) = (r8v17 boolean), (r8v24 boolean) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r9v16 java.lang.String) = (r9v13 java.lang.String), (r9v20 java.lang.String) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r10v17 java.util.Date) = (r10v14 java.util.Date), (r10v28 java.util.Date) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r11v16 YgZ.n) = (r11v13 YgZ.n), (r11v19 YgZ.n) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r12v16 java.util.Locale) = (r12v13 java.util.Locale), (r12v29 java.util.Locale) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r13v7 okhttp3.Request$Builder) = (r13v4 okhttp3.Request$Builder), (r13v27 okhttp3.Request$Builder) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r14v4 qE.SPz$j) = (r14v1 qE.SPz$j), (r14v15 qE.SPz$j) binds: [B:48:0x0297, B:20:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02a5  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0370  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x03fc  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0426  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x047a A[PHI: r1 r4 r5 r6 r8 r9 r10 r11
          0x047a: PHI (r1v44 java.lang.Object) = (r1v43 java.lang.Object), (r1v1 java.lang.Object) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r4v26 boolean) = (r4v24 boolean), (r4v32 boolean) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r5v43 java.lang.String) = (r5v40 java.lang.String), (r5v51 java.lang.String) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r6v27 okhttp3.Request$Builder) = (r6v24 okhttp3.Request$Builder), (r6v32 okhttp3.Request$Builder) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r8v40 java.lang.String) = (r8v37 java.lang.String), (r8v42 java.lang.String) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r9v36 java.util.Map) = (r9v33 java.util.Map), (r9v38 java.util.Map) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r10v49 java.lang.String) = (r10v45 java.lang.String), (r10v52 java.lang.String) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x047a: PHI (r11v35 qE.SPz$j) = (r11v32 qE.SPz$j), (r11v37 qE.SPz$j) binds: [B:86:0x0476, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x04d7  */
        @Override // qE.Q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(Request.Builder builder, boolean z2, Continuation continuation) {
            n nVar;
            Locale locale;
            YgZ.n nVar2;
            Request.Builder builder2;
            boolean z3;
            j jVar;
            Object objRl;
            boolean z4;
            j jVar2;
            Request.Builder builder3;
            YgZ.n nVar3;
            boolean z5;
            Locale locale2;
            Date date;
            String str;
            j jVar3;
            Object objJ2;
            String str2;
            Request.Builder builder4;
            YgZ.n nVar4;
            boolean z6;
            boolean z7;
            Locale locale3;
            Date date2;
            j jVar4;
            String strT;
            int i2;
            String str3;
            Request.Builder builderAddHeader;
            Object objO;
            final Map map;
            String str4;
            String str5;
            String str6;
            Request.Builder builderKN;
            String str7;
            Request.Builder builderKN2;
            String str8;
            Request.Builder builderKN3;
            String str9;
            Request.Builder builderKN4;
            String str10;
            Request.Builder builderKN5;
            String str11;
            Request.Builder builderO;
            String str12;
            j jVar5;
            IdentityToken identityToken;
            String str13;
            Object objViF;
            Request.Builder builder5;
            String str14;
            String token;
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i3 = nVar.f72241X;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f72241X = i3 - Integer.MIN_VALUE;
                } else {
                    nVar = new n(continuation);
                }
            }
            Object objRl2 = nVar.E2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (nVar.f72241X) {
                case 0:
                    ResultKt.throwOnFailure(objRl2);
                    locale = Locale.getDefault();
                    nVar2 = new YgZ.n();
                    Fyf.w6 w6Var = this.f72237n;
                    nVar.f72245n = this;
                    builder2 = builder;
                    nVar.f72248t = builder2;
                    nVar.f72239O = locale;
                    nVar.J2 = nVar2;
                    z3 = z2;
                    nVar.f72240S = z3;
                    nVar.f72241X = 1;
                    objRl2 = w6Var.rl(nVar);
                    if (objRl2 != coroutine_suspended) {
                        jVar = this;
                        boolean zRl = ((Fyf.j) objRl2).rl();
                        Fyf.w6 w6Var2 = jVar.f72237n;
                        nVar.f72245n = jVar;
                        nVar.f72248t = builder2;
                        nVar.f72239O = locale;
                        nVar.J2 = nVar2;
                        nVar.f72240S = z3;
                        nVar.f72244g = zRl;
                        nVar.f72241X = 2;
                        objRl = w6Var2.rl(nVar);
                        if (objRl != coroutine_suspended) {
                            Request.Builder builder6 = builder2;
                            z4 = zRl;
                            objRl2 = objRl;
                            jVar2 = jVar;
                            builder3 = builder6;
                            Locale locale4 = locale;
                            nVar3 = nVar2;
                            z5 = z3;
                            locale2 = locale4;
                            Date dateN = ((Fyf.j) objRl2).n();
                            if (z5) {
                                TFv.Wre wreN = jVar2.rl.n();
                                nVar.f72245n = jVar2;
                                nVar.f72248t = builder3;
                                nVar.f72239O = locale2;
                                nVar.J2 = nVar3;
                                nVar.f72247r = dateN;
                                nVar.f72240S = z4;
                                nVar.f72241X = 3;
                                Object objViF2 = TFv.fuX.ViF(wreN, nVar);
                                if (objViF2 != coroutine_suspended) {
                                    date = dateN;
                                    objRl2 = objViF2;
                                    str = (String) objRl2;
                                    jVar3 = jVar2;
                                    boolean zN = jVar3.f72238t.n();
                                    Dsr.n nVar5 = jVar3.nr;
                                    nVar.f72245n = jVar3;
                                    nVar.f72248t = builder3;
                                    nVar.f72239O = locale2;
                                    nVar.J2 = nVar3;
                                    nVar.f72247r = date;
                                    nVar.f72246o = str;
                                    nVar.f72240S = z4;
                                    nVar.f72244g = zN;
                                    nVar.f72241X = 4;
                                    objJ2 = nVar5.J2(nVar);
                                    if (objJ2 != coroutine_suspended) {
                                    }
                                }
                            } else {
                                date = dateN;
                                str = null;
                                jVar3 = jVar2;
                                boolean zN2 = jVar3.f72238t.n();
                                Dsr.n nVar52 = jVar3.nr;
                                nVar.f72245n = jVar3;
                                nVar.f72248t = builder3;
                                nVar.f72239O = locale2;
                                nVar.J2 = nVar3;
                                nVar.f72247r = date;
                                nVar.f72246o = str;
                                nVar.f72240S = z4;
                                nVar.f72244g = zN2;
                                nVar.f72241X = 4;
                                objJ2 = nVar52.J2(nVar);
                                if (objJ2 != coroutine_suspended) {
                                    YgZ.n nVar6 = nVar3;
                                    str2 = str;
                                    objRl2 = objJ2;
                                    builder4 = builder3;
                                    nVar4 = nVar6;
                                    Date date3 = date;
                                    z6 = z4;
                                    z7 = zN2;
                                    locale3 = locale2;
                                    date2 = date3;
                                    android.support.v4.media.j.n(objRl2);
                                    Dsr.n nVar7 = jVar3.nr;
                                    nVar.f72245n = jVar3;
                                    nVar.f72248t = builder4;
                                    nVar.f72239O = locale3;
                                    nVar.J2 = nVar4;
                                    nVar.f72247r = date2;
                                    nVar.f72246o = str2;
                                    nVar.f72242Z = null;
                                    nVar.f72240S = z6;
                                    nVar.f72244g = z7;
                                    nVar.f72241X = 5;
                                    objRl2 = nVar7.mUb(nVar);
                                    if (objRl2 != coroutine_suspended) {
                                        Locale locale5 = locale3;
                                        YgZ.n nVar8 = nVar4;
                                        jVar4 = jVar3;
                                        Request.Builder builder7 = builder4;
                                        Map map2 = (Map) objRl2;
                                        String strO = jVar4.nr.O();
                                        String strN = strO == null ? jVar4.KN.n(strO) : null;
                                        String string = locale5.toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                        Request.Builder builderAddHeader2 = builder7.addHeader("Locale", string);
                                        String country = locale5.getCountry();
                                        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
                                        Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("Country", country);
                                        String language = locale5.getLanguage();
                                        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                                        Request.Builder builderAddHeader4 = builderAddHeader3.addHeader("Language", language).addHeader("OS-Version", nVar8.KN()).addHeader("Platform", "Android").addHeader("Device-Type", String.valueOf(nVar8.mUb(jVar4.f72236O)));
                                        YgZ.w6 w6Var3 = YgZ.w6.f12217n;
                                        Request.Builder builderAddHeader5 = builderAddHeader4.addHeader("Device-Manufacturer", w6Var3.J2()).addHeader("Device-Model", w6Var3.Uo()).addHeader("Build-Number", String.valueOf(w6Var3.rl(jVar4.f72236O)));
                                        strT = xFr.s4.t(w6Var3.t(jVar4.f72236O));
                                        if (strT == null) {
                                            strT = w6Var3.t(jVar4.f72236O);
                                        }
                                        Request.Builder builderAddHeader6 = builderAddHeader5.addHeader("Build-Version", strT).addHeader("Bsp-Id", jVar4.nr.rl()).addHeader("First-Install-Timestamp", String.valueOf(q3M.j.rl(date2)));
                                        i2 = C1114j.$EnumSwitchMapping$0[jVar4.nr.nr().ordinal()];
                                        if (i2 != 1) {
                                            str3 = "Development";
                                        } else {
                                            if (i2 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            str3 = "Production";
                                        }
                                        builderAddHeader = builderAddHeader6.addHeader("Environment", str3).addHeader("Is-Old-User", String.valueOf(z6));
                                        InterfaceC1335n interfaceC1335n = jVar4.J2;
                                        Id.Predefined.Internal.j jVar6 = Id.Predefined.Internal.j.f51217O;
                                        nVar.f72245n = jVar4;
                                        nVar.f72248t = str2;
                                        nVar.f72239O = null;
                                        nVar.J2 = map2;
                                        nVar.f72247r = strN;
                                        nVar.f72246o = builderAddHeader;
                                        nVar.f72242Z = "Backup-Persistent-Id";
                                        nVar.f72240S = z7;
                                        nVar.f72241X = 6;
                                        objO = interfaceC1335n.O(jVar6, nVar);
                                        if (objO != coroutine_suspended) {
                                            String str15 = str2;
                                            map = map2;
                                            objRl2 = objO;
                                            str4 = "Backup-Persistent-Id";
                                            str5 = str15;
                                            str6 = strN;
                                            builderKN = SPz.KN(builderAddHeader, str4, (x0X.n) objRl2);
                                            InterfaceC1335n interfaceC1335n2 = jVar4.J2;
                                            Id.Predefined.Internal.j jVar7 = Id.Predefined.Internal.j.J2;
                                            nVar.f72245n = jVar4;
                                            nVar.f72248t = str5;
                                            nVar.f72239O = null;
                                            nVar.J2 = map;
                                            nVar.f72247r = str6;
                                            nVar.f72246o = builderKN;
                                            nVar.f72242Z = "Non-Backup-Persistent-Id";
                                            nVar.f72240S = z7;
                                            nVar.f72241X = 7;
                                            objRl2 = interfaceC1335n2.O(jVar7, nVar);
                                            if (objRl2 != coroutine_suspended) {
                                                str7 = "Non-Backup-Persistent-Id";
                                                builderKN2 = SPz.KN(builderKN, str7, (x0X.n) objRl2);
                                                InterfaceC1335n interfaceC1335n3 = jVar4.J2;
                                                Id.Predefined.External.j jVar8 = Id.Predefined.External.j.f51212O;
                                                nVar.f72245n = jVar4;
                                                nVar.f72248t = str5;
                                                nVar.f72239O = null;
                                                nVar.J2 = map;
                                                nVar.f72247r = str6;
                                                nVar.f72246o = builderKN2;
                                                nVar.f72242Z = "Aaid";
                                                nVar.f72240S = z7;
                                                nVar.f72241X = 8;
                                                objRl2 = interfaceC1335n3.t(jVar8, nVar);
                                                if (objRl2 != coroutine_suspended) {
                                                    str8 = "Aaid";
                                                    builderKN3 = SPz.KN(builderKN2, str8, (x0X.n) objRl2);
                                                    InterfaceC1335n interfaceC1335n4 = jVar4.J2;
                                                    Id.Predefined.External.j jVar9 = Id.Predefined.External.j.J2;
                                                    nVar.f72245n = jVar4;
                                                    nVar.f72248t = str5;
                                                    nVar.f72239O = null;
                                                    nVar.J2 = map;
                                                    nVar.f72247r = str6;
                                                    nVar.f72246o = builderKN3;
                                                    nVar.f72242Z = "App-Set-Id";
                                                    nVar.f72240S = z7;
                                                    nVar.f72241X = 9;
                                                    objRl2 = interfaceC1335n4.t(jVar9, nVar);
                                                    if (objRl2 != coroutine_suspended) {
                                                        str9 = "App-Set-Id";
                                                        builderKN4 = SPz.KN(builderKN3, str9, (x0X.n) objRl2);
                                                        InterfaceC1335n interfaceC1335n5 = jVar4.J2;
                                                        Id.Predefined.Internal.j jVar10 = Id.Predefined.Internal.j.f51220t;
                                                        nVar.f72245n = jVar4;
                                                        nVar.f72248t = str5;
                                                        nVar.f72239O = null;
                                                        nVar.J2 = map;
                                                        nVar.f72247r = str6;
                                                        nVar.f72246o = builderKN4;
                                                        nVar.f72242Z = "Android-Id";
                                                        nVar.f72240S = z7;
                                                        nVar.f72241X = 10;
                                                        objRl2 = interfaceC1335n5.O(jVar10, nVar);
                                                        if (objRl2 != coroutine_suspended) {
                                                            str10 = "Android-Id";
                                                            builderKN5 = SPz.KN(builderKN4, str10, (x0X.n) objRl2);
                                                            InterfaceC1335n interfaceC1335n6 = jVar4.J2;
                                                            nVar.f72245n = jVar4;
                                                            nVar.f72248t = str5;
                                                            nVar.f72239O = null;
                                                            nVar.J2 = map;
                                                            nVar.f72247r = str6;
                                                            nVar.f72246o = builderKN5;
                                                            str11 = "Adid";
                                                            nVar.f72242Z = "Adid";
                                                            nVar.f72240S = z7;
                                                            nVar.f72241X = 11;
                                                            objRl2 = interfaceC1335n6.KN("adid", nVar);
                                                            if (objRl2 != coroutine_suspended) {
                                                                builderO = SPz.O(SPz.nr(SPz.nr(SPz.nr(SPz.nr(SPz.KN(builderKN5, str11, (x0X.n) objRl2), "Last-Settings-Hash", str5), "Spooner-Secret", str6).addHeader("settings-response-version", "v2").addHeader("Is-App-Running-In-Background", String.valueOf(z7)), AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, null), "is-signup-session", null), "custom-attributes", new Function0() { // from class: qE.r
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return SPz.j.t(map);
                                                                    }
                                                                });
                                                                TFv.Wre wreT = jVar4.Uo.t();
                                                                nVar.f72245n = jVar4;
                                                                nVar.f72248t = builderO;
                                                                str12 = "authorization";
                                                                nVar.f72239O = "authorization";
                                                                nVar.J2 = null;
                                                                nVar.f72247r = null;
                                                                nVar.f72246o = null;
                                                                nVar.f72242Z = null;
                                                                nVar.f72241X = 12;
                                                                objRl2 = TFv.fuX.ViF(wreT, nVar);
                                                                if (objRl2 != coroutine_suspended) {
                                                                    jVar5 = jVar4;
                                                                    identityToken = (IdentityToken) objRl2;
                                                                    if (identityToken != null || (token = identityToken.getToken()) == null) {
                                                                        str13 = null;
                                                                    } else {
                                                                        str13 = "Bearer " + token;
                                                                    }
                                                                    Request.Builder builderNr = SPz.nr(builderO, str12, str13);
                                                                    TFv.Wre wreN2 = jVar5.Uo.n();
                                                                    nVar.f72245n = builderNr;
                                                                    nVar.f72248t = "refresh-token";
                                                                    nVar.f72239O = null;
                                                                    nVar.f72241X = 13;
                                                                    objViF = TFv.fuX.ViF(wreN2, nVar);
                                                                    if (objViF != coroutine_suspended) {
                                                                        builder5 = builderNr;
                                                                        objRl2 = objViF;
                                                                        str14 = "refresh-token";
                                                                        return SPz.nr(builder5, str14, (String) objRl2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    boolean z9 = nVar.f72240S;
                    nVar2 = (YgZ.n) nVar.J2;
                    locale = (Locale) nVar.f72239O;
                    Request.Builder builder8 = (Request.Builder) nVar.f72248t;
                    jVar = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    z3 = z9;
                    builder2 = builder8;
                    boolean zRl2 = ((Fyf.j) objRl2).rl();
                    Fyf.w6 w6Var22 = jVar.f72237n;
                    nVar.f72245n = jVar;
                    nVar.f72248t = builder2;
                    nVar.f72239O = locale;
                    nVar.J2 = nVar2;
                    nVar.f72240S = z3;
                    nVar.f72244g = zRl2;
                    nVar.f72241X = 2;
                    objRl = w6Var22.rl(nVar);
                    if (objRl != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    z4 = nVar.f72244g;
                    z5 = nVar.f72240S;
                    nVar3 = (YgZ.n) nVar.J2;
                    locale2 = (Locale) nVar.f72239O;
                    builder3 = (Request.Builder) nVar.f72248t;
                    jVar2 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    Date dateN2 = ((Fyf.j) objRl2).n();
                    if (z5) {
                    }
                    break;
                case 3:
                    z4 = nVar.f72240S;
                    date = (Date) nVar.f72247r;
                    nVar3 = (YgZ.n) nVar.J2;
                    locale2 = (Locale) nVar.f72239O;
                    builder3 = (Request.Builder) nVar.f72248t;
                    jVar2 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    str = (String) objRl2;
                    jVar3 = jVar2;
                    boolean zN22 = jVar3.f72238t.n();
                    Dsr.n nVar522 = jVar3.nr;
                    nVar.f72245n = jVar3;
                    nVar.f72248t = builder3;
                    nVar.f72239O = locale2;
                    nVar.J2 = nVar3;
                    nVar.f72247r = date;
                    nVar.f72246o = str;
                    nVar.f72240S = z4;
                    nVar.f72244g = zN22;
                    nVar.f72241X = 4;
                    objJ2 = nVar522.J2(nVar);
                    if (objJ2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    z7 = nVar.f72244g;
                    z6 = nVar.f72240S;
                    str2 = (String) nVar.f72246o;
                    date2 = (Date) nVar.f72247r;
                    nVar4 = (YgZ.n) nVar.J2;
                    locale3 = (Locale) nVar.f72239O;
                    builder4 = (Request.Builder) nVar.f72248t;
                    jVar3 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    android.support.v4.media.j.n(objRl2);
                    Dsr.n nVar72 = jVar3.nr;
                    nVar.f72245n = jVar3;
                    nVar.f72248t = builder4;
                    nVar.f72239O = locale3;
                    nVar.J2 = nVar4;
                    nVar.f72247r = date2;
                    nVar.f72246o = str2;
                    nVar.f72242Z = null;
                    nVar.f72240S = z6;
                    nVar.f72244g = z7;
                    nVar.f72241X = 5;
                    objRl2 = nVar72.mUb(nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    z7 = nVar.f72244g;
                    z6 = nVar.f72240S;
                    android.support.v4.media.j.n(nVar.f72242Z);
                    str2 = (String) nVar.f72246o;
                    date2 = (Date) nVar.f72247r;
                    nVar4 = (YgZ.n) nVar.J2;
                    locale3 = (Locale) nVar.f72239O;
                    builder4 = (Request.Builder) nVar.f72248t;
                    jVar3 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    Locale locale52 = locale3;
                    YgZ.n nVar82 = nVar4;
                    jVar4 = jVar3;
                    Request.Builder builder72 = builder4;
                    Map map22 = (Map) objRl2;
                    String strO2 = jVar4.nr.O();
                    if (strO2 == null) {
                    }
                    String string2 = locale52.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Request.Builder builderAddHeader22 = builder72.addHeader("Locale", string2);
                    String country2 = locale52.getCountry();
                    Intrinsics.checkNotNullExpressionValue(country2, "getCountry(...)");
                    Request.Builder builderAddHeader32 = builderAddHeader22.addHeader("Country", country2);
                    String language2 = locale52.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
                    Request.Builder builderAddHeader42 = builderAddHeader32.addHeader("Language", language2).addHeader("OS-Version", nVar82.KN()).addHeader("Platform", "Android").addHeader("Device-Type", String.valueOf(nVar82.mUb(jVar4.f72236O)));
                    YgZ.w6 w6Var32 = YgZ.w6.f12217n;
                    Request.Builder builderAddHeader52 = builderAddHeader42.addHeader("Device-Manufacturer", w6Var32.J2()).addHeader("Device-Model", w6Var32.Uo()).addHeader("Build-Number", String.valueOf(w6Var32.rl(jVar4.f72236O)));
                    strT = xFr.s4.t(w6Var32.t(jVar4.f72236O));
                    if (strT == null) {
                    }
                    Request.Builder builderAddHeader62 = builderAddHeader52.addHeader("Build-Version", strT).addHeader("Bsp-Id", jVar4.nr.rl()).addHeader("First-Install-Timestamp", String.valueOf(q3M.j.rl(date2)));
                    i2 = C1114j.$EnumSwitchMapping$0[jVar4.nr.nr().ordinal()];
                    if (i2 != 1) {
                    }
                    builderAddHeader = builderAddHeader62.addHeader("Environment", str3).addHeader("Is-Old-User", String.valueOf(z6));
                    InterfaceC1335n interfaceC1335n7 = jVar4.J2;
                    Id.Predefined.Internal.j jVar62 = Id.Predefined.Internal.j.f51217O;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str2;
                    nVar.f72239O = null;
                    nVar.J2 = map22;
                    nVar.f72247r = strN;
                    nVar.f72246o = builderAddHeader;
                    nVar.f72242Z = "Backup-Persistent-Id";
                    nVar.f72240S = z7;
                    nVar.f72241X = 6;
                    objO = interfaceC1335n7.O(jVar62, nVar);
                    if (objO != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    z7 = nVar.f72240S;
                    str4 = (String) nVar.f72242Z;
                    builderAddHeader = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderKN = SPz.KN(builderAddHeader, str4, (x0X.n) objRl2);
                    InterfaceC1335n interfaceC1335n22 = jVar4.J2;
                    Id.Predefined.Internal.j jVar72 = Id.Predefined.Internal.j.J2;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str5;
                    nVar.f72239O = null;
                    nVar.J2 = map;
                    nVar.f72247r = str6;
                    nVar.f72246o = builderKN;
                    nVar.f72242Z = "Non-Backup-Persistent-Id";
                    nVar.f72240S = z7;
                    nVar.f72241X = 7;
                    objRl2 = interfaceC1335n22.O(jVar72, nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 7:
                    z7 = nVar.f72240S;
                    str7 = (String) nVar.f72242Z;
                    builderKN = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderKN2 = SPz.KN(builderKN, str7, (x0X.n) objRl2);
                    InterfaceC1335n interfaceC1335n32 = jVar4.J2;
                    Id.Predefined.External.j jVar82 = Id.Predefined.External.j.f51212O;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str5;
                    nVar.f72239O = null;
                    nVar.J2 = map;
                    nVar.f72247r = str6;
                    nVar.f72246o = builderKN2;
                    nVar.f72242Z = "Aaid";
                    nVar.f72240S = z7;
                    nVar.f72241X = 8;
                    objRl2 = interfaceC1335n32.t(jVar82, nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 8:
                    z7 = nVar.f72240S;
                    str8 = (String) nVar.f72242Z;
                    builderKN2 = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderKN3 = SPz.KN(builderKN2, str8, (x0X.n) objRl2);
                    InterfaceC1335n interfaceC1335n42 = jVar4.J2;
                    Id.Predefined.External.j jVar92 = Id.Predefined.External.j.J2;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str5;
                    nVar.f72239O = null;
                    nVar.J2 = map;
                    nVar.f72247r = str6;
                    nVar.f72246o = builderKN3;
                    nVar.f72242Z = "App-Set-Id";
                    nVar.f72240S = z7;
                    nVar.f72241X = 9;
                    objRl2 = interfaceC1335n42.t(jVar92, nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 9:
                    z7 = nVar.f72240S;
                    str9 = (String) nVar.f72242Z;
                    builderKN3 = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderKN4 = SPz.KN(builderKN3, str9, (x0X.n) objRl2);
                    InterfaceC1335n interfaceC1335n52 = jVar4.J2;
                    Id.Predefined.Internal.j jVar102 = Id.Predefined.Internal.j.f51220t;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str5;
                    nVar.f72239O = null;
                    nVar.J2 = map;
                    nVar.f72247r = str6;
                    nVar.f72246o = builderKN4;
                    nVar.f72242Z = "Android-Id";
                    nVar.f72240S = z7;
                    nVar.f72241X = 10;
                    objRl2 = interfaceC1335n52.O(jVar102, nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 10:
                    z7 = nVar.f72240S;
                    str10 = (String) nVar.f72242Z;
                    builderKN4 = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderKN5 = SPz.KN(builderKN4, str10, (x0X.n) objRl2);
                    InterfaceC1335n interfaceC1335n62 = jVar4.J2;
                    nVar.f72245n = jVar4;
                    nVar.f72248t = str5;
                    nVar.f72239O = null;
                    nVar.J2 = map;
                    nVar.f72247r = str6;
                    nVar.f72246o = builderKN5;
                    str11 = "Adid";
                    nVar.f72242Z = "Adid";
                    nVar.f72240S = z7;
                    nVar.f72241X = 11;
                    objRl2 = interfaceC1335n62.KN("adid", nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 11:
                    z7 = nVar.f72240S;
                    str11 = (String) nVar.f72242Z;
                    builderKN5 = (Request.Builder) nVar.f72246o;
                    str6 = (String) nVar.f72247r;
                    map = (Map) nVar.J2;
                    android.support.v4.media.j.n(nVar.f72239O);
                    str5 = (String) nVar.f72248t;
                    jVar4 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    builderO = SPz.O(SPz.nr(SPz.nr(SPz.nr(SPz.nr(SPz.KN(builderKN5, str11, (x0X.n) objRl2), "Last-Settings-Hash", str5), "Spooner-Secret", str6).addHeader("settings-response-version", "v2").addHeader("Is-App-Running-In-Background", String.valueOf(z7)), AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, null), "is-signup-session", null), "custom-attributes", new Function0() { // from class: qE.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SPz.j.t(map);
                        }
                    });
                    TFv.Wre wreT2 = jVar4.Uo.t();
                    nVar.f72245n = jVar4;
                    nVar.f72248t = builderO;
                    str12 = "authorization";
                    nVar.f72239O = "authorization";
                    nVar.J2 = null;
                    nVar.f72247r = null;
                    nVar.f72246o = null;
                    nVar.f72242Z = null;
                    nVar.f72241X = 12;
                    objRl2 = TFv.fuX.ViF(wreT2, nVar);
                    if (objRl2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 12:
                    str12 = (String) nVar.f72239O;
                    builderO = (Request.Builder) nVar.f72248t;
                    jVar5 = (j) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    identityToken = (IdentityToken) objRl2;
                    if (identityToken != null) {
                        break;
                    }
                    str13 = null;
                    Request.Builder builderNr2 = SPz.nr(builderO, str12, str13);
                    TFv.Wre wreN22 = jVar5.Uo.n();
                    nVar.f72245n = builderNr2;
                    nVar.f72248t = "refresh-token";
                    nVar.f72239O = null;
                    nVar.f72241X = 13;
                    objViF = TFv.fuX.ViF(wreN22, nVar);
                    if (objViF != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 13:
                    str14 = (String) nVar.f72248t;
                    builder5 = (Request.Builder) nVar.f72245n;
                    ResultKt.throwOnFailure(objRl2);
                    return SPz.nr(builder5, str14, (String) objRl2);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: qE.SPz$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C1114j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Dsr.Ml.values().length];
                try {
                    iArr[Dsr.Ml.f72487n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Dsr.Ml.f72488t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(Fyf.w6 w6Var, fuX fux, qE.n nVar, Dsr.n nVar2, Context context, InterfaceC1335n interfaceC1335n, oh.I28 i28, WYs.j jVar) {
            this.f72237n = w6Var;
            this.rl = fux;
            this.f72238t = nVar;
            this.nr = nVar2;
            this.f72236O = context;
            this.J2 = interfaceC1335n;
            this.Uo = i28;
            this.KN = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(Map map) throws JSONException {
            if (!map.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                return jSONObject.toString();
            }
            return null;
        }
    }

    public static final Q J2(Context context, Dsr.n config, InterfaceC1335n concierge, Fyf.w6 installManager, fuX oracleResponseDataStore, oh.I28 oracleAuthenticationDataStore, n getIsAppInBackgroundUseCase, WYs.j secretDecrypter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        Intrinsics.checkNotNullParameter(oracleResponseDataStore, "oracleResponseDataStore");
        Intrinsics.checkNotNullParameter(oracleAuthenticationDataStore, "oracleAuthenticationDataStore");
        Intrinsics.checkNotNullParameter(getIsAppInBackgroundUseCase, "getIsAppInBackgroundUseCase");
        Intrinsics.checkNotNullParameter(secretDecrypter, "secretDecrypter");
        return new j(installManager, oracleResponseDataStore, getIsAppInBackgroundUseCase, config, context, concierge, oracleAuthenticationDataStore, secretDecrypter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request.Builder KN(Request.Builder builder, String str, x0X.n nVar) {
        Id id;
        try {
            id = (Id) x0X.w6.nr(nVar);
        } catch (IllegalArgumentException e2) {
            Log.w("OracleServiceHeaderProvider", "Invalid value for header " + str + ": " + nVar + ". Error message: " + e2.getMessage());
        }
        if (id != null) {
            if (builder.addHeader(str, id.getValue()) == null) {
            }
            return builder;
        }
        Log.w("OracleServiceHeaderProvider", "Could not retrieve id " + str + " from Concierge.");
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request.Builder nr(Request.Builder builder, String str, String str2) {
        if (str2 != null) {
            builder.addHeader(str, str2);
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request.Builder O(Request.Builder builder, String str, Function0 function0) {
        String str2 = (String) function0.invoke();
        if (str2 != null) {
            builder.addHeader(str, str2);
        }
        return builder;
    }
}
