package Fyf;

import Dk.InterfaceC1335n;
import Fyf.w6;
import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.bendingspoons.concierge.domain.entities.Id;
import com.bendingspoons.install.InstallEventData;
import foC.j;
import java.io.IOException;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements Fyf.w6 {
    private Fyf.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final foC.j f3358O;
    private final w6.n nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1335n f3359t;
    public static final j Uo = new j(null);
    private static final j.C0927j KN = new j.C0927j("appVersionKey");
    private static final j.C0927j xMQ = new j.C0927j("bundleVersionKey");
    private static final j.C0927j mUb = new j.C0927j("isOldUserKey");

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f3360O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3361n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3362t;

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ foC.j f3363n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f3364t;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    String string = this.f3363n.J2().getString(this.f3364t, "");
                    if (string != null) {
                        return this.f3363n.nr().adapter(Boolean.class).fromJson(string);
                    }
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }

            public j(foC.j jVar, String str) {
                this.f3363n = jVar;
                this.f3364t = str;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new n(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {, blocks: (B:10:0x0055, B:15:0x005f, B:17:0x0065, B:21:0x0073, B:27:0x007d, B:29:0x0098, B:48:0x0123, B:51:0x012b, B:31:0x00a7, B:33:0x00b3, B:34:0x00c2, B:36:0x00ce, B:37:0x00df, B:39:0x00eb, B:40:0x00fb, B:42:0x0107, B:44:0x0113, B:45:0x0116, B:46:0x011d, B:47:0x011e), top: B:71:0x0055 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            Date date;
            Date date2;
            Object obj2;
            Object objInvoke;
            Date date3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3360O;
            boolean zBooleanValue = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    date3 = (Date) this.f3362t;
                    date = (Date) this.f3361n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PackageInfo packageInfo = Ml.this.rl.getPackageManager().getPackageInfo(Ml.this.rl.getPackageName(), 0);
                date = new Date(packageInfo.firstInstallTime);
                date2 = new Date(packageInfo.lastUpdateTime);
                foC.j jVar = Ml.this.f3358O;
                j.C0927j c0927j = Ml.mUb;
                synchronized (jVar) {
                    obj2 = null;
                    if (jVar.rl(c0927j)) {
                        if (jVar.t()) {
                            Object obj3 = jVar.O().get(c0927j);
                            if (obj3 instanceof Boolean) {
                                obj2 = obj3;
                            }
                            obj2 = (Boolean) obj2;
                            if (obj2 == null) {
                                String strN = c0927j.n();
                                j jVar2 = new j(jVar, strN);
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    objInvoke = Boxing.boxBoolean(jVar.J2().getBoolean(strN, false));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxInt(jVar.J2().getInt(strN, 0));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxLong(jVar.J2().getLong(strN, 0L));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    objInvoke = (Boolean) Boxing.boxFloat(jVar.J2().getFloat(strN, 0.0f));
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    Object string = jVar.J2().getString(strN, "");
                                    if (string != null) {
                                        objInvoke = (Boolean) string;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                    }
                                } else {
                                    objInvoke = jVar2.invoke();
                                }
                                obj2 = objInvoke;
                                if (jVar.t() && obj2 != null) {
                                    jVar.O().put(c0927j, obj2);
                                }
                            }
                        }
                        Fyf.j jVar3 = new Fyf.j(date, date2, zBooleanValue);
                        Ml.this.J2 = jVar3;
                        return jVar3;
                    }
                }
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    w6.n nVar = Ml.this.nr;
                    this.f3361n = date;
                    this.f3362t = date2;
                    this.f3360O = 1;
                    obj = nVar.n(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    date3 = date2;
                } else {
                    zBooleanValue = bool.booleanValue();
                    Fyf.j jVar32 = new Fyf.j(date, date2, zBooleanValue);
                    Ml.this.J2 = jVar32;
                    return jVar32;
                }
            }
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
                date2 = date3;
            } else {
                date2 = date3;
                if (Intrinsics.areEqual(date, date3)) {
                    zBooleanValue = false;
                }
            }
            Fyf.j jVar322 = new Fyf.j(date, date2, zBooleanValue);
            Ml.this.J2 = jVar322;
            return jVar322;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3365O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3366n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3368r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3369t;

        public static final class j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ foC.j f3370n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f3371t;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    String string = this.f3370n.J2().getString(this.f3371t, "");
                    if (string != null) {
                        return this.f3370n.nr().adapter(String.class).fromJson(string);
                    }
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }

            public j(foC.j jVar, String str) {
                this.f3370n = jVar;
                this.f3371t = str;
            }
        }

        public static final class n implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ foC.j f3372n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f3373t;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    String string = this.f3372n.J2().getString(this.f3373t, "");
                    if (string != null) {
                        return this.f3372n.nr().adapter(String.class).fromJson(string);
                    }
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            }

            public n(foC.j jVar, String str) {
                this.f3372n = jVar;
                this.f3373t = str;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:148:0x0367  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x038f  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x03ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            Object objInvoke2;
            Object obj2;
            Object objRl;
            String str;
            String str2;
            Object objO;
            String str3;
            Fyf.j jVar;
            x0X.n nVar;
            Object objO2;
            Id.Predefined.Internal.BackupPersistentId backupPersistentId;
            String str4;
            String str5;
            x0X.n nVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3368r;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                foC.j jVar2 = Ml.this.f3358O;
                j.C0927j c0927j = Ml.KN;
                synchronized (jVar2) {
                    if (jVar2.rl(c0927j)) {
                        if (jVar2.t()) {
                            Object obj3 = jVar2.O().get(c0927j);
                            if (!(obj3 instanceof String)) {
                                obj3 = null;
                            }
                            objInvoke = (String) obj3;
                            if (objInvoke != null) {
                            }
                        }
                        String strN = c0927j.n();
                        j jVar3 = new j(jVar2, strN);
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            objInvoke = (String) Boxing.boxBoolean(jVar2.J2().getBoolean(strN, false));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            objInvoke = (String) Boxing.boxInt(jVar2.J2().getInt(strN, 0));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            objInvoke = (String) Boxing.boxLong(jVar2.J2().getLong(strN, 0L));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            objInvoke = (String) Boxing.boxFloat(jVar2.J2().getFloat(strN, 0.0f));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                            objInvoke = jVar2.J2().getString(strN, "");
                            if (objInvoke == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else {
                            objInvoke = jVar3.invoke();
                        }
                        if (jVar2.t() && objInvoke != null) {
                            jVar2.O().put(c0927j, objInvoke);
                        }
                    } else {
                        objInvoke = null;
                    }
                }
                String str6 = (String) objInvoke;
                foC.j jVar4 = Ml.this.f3358O;
                j.C0927j c0927j2 = Ml.xMQ;
                synchronized (jVar4) {
                    if (jVar4.rl(c0927j2)) {
                        if (jVar4.t()) {
                            Object obj4 = jVar4.O().get(c0927j2);
                            if (!(obj4 instanceof String)) {
                                obj4 = null;
                            }
                            obj2 = (String) obj4;
                            if (obj2 != null) {
                            }
                        }
                        String strN2 = c0927j2.n();
                        n nVar3 = new n(jVar4, strN2);
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            objInvoke2 = (String) Boxing.boxBoolean(jVar4.J2().getBoolean(strN2, false));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            objInvoke2 = (String) Boxing.boxInt(jVar4.J2().getInt(strN2, 0));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            objInvoke2 = (String) Boxing.boxLong(jVar4.J2().getLong(strN2, 0L));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            objInvoke2 = (String) Boxing.boxFloat(jVar4.J2().getFloat(strN2, 0.0f));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                            objInvoke2 = jVar4.J2().getString(strN2, "");
                            if (objInvoke2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else {
                            objInvoke2 = nVar3.invoke();
                        }
                        obj2 = objInvoke2;
                        if (jVar4.t() && obj2 != null) {
                            jVar4.O().put(c0927j2, obj2);
                        }
                    } else {
                        obj2 = null;
                    }
                }
                String str7 = (String) obj2;
                Ml ml = Ml.this;
                this.f3366n = str6;
                this.f3369t = str7;
                this.f3368r = 1;
                objRl = ml.rl(this);
                if (objRl != coroutine_suspended) {
                    str = str6;
                    str2 = str7;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    backupPersistentId = (Id.Predefined.Internal.BackupPersistentId) this.J2;
                    jVar = (Fyf.j) this.f3365O;
                    String str8 = (String) this.f3369t;
                    String str9 = (String) this.f3366n;
                    ResultKt.throwOnFailure(obj);
                    str4 = str8;
                    str5 = str9;
                    objO2 = obj;
                    nVar2 = (x0X.n) objO2;
                    if (!(nVar2 instanceof n.C1266n)) {
                        return new n.C1266n(new IllegalStateException("Non Backup Persistent ID not found: " + ((zD.j) ((n.C1266n) nVar2).n()).rl()));
                    }
                    if (!(nVar2 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objN = ((n.w6) nVar2).n();
                    Intrinsics.checkNotNull(objN, "null cannot be cast to non-null type com.bendingspoons.concierge.domain.entities.Id.Predefined.Internal.NonBackupPersistentId");
                    Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentId = (Id.Predefined.Internal.NonBackupPersistentId) objN;
                    String strT = YgZ.w6.f12217n.t(Ml.this.rl);
                    CreationType creationType = backupPersistentId.getCreationType();
                    CreationType creationType2 = CreationType.READ_FROM_FILE;
                    if (creationType == creationType2 && nonBackupPersistentId.getCreationType() == creationType2 && Intrinsics.areEqual(str5, strT)) {
                        return new n.w6(null);
                    }
                    return new n.w6(new InstallEventData(jVar.rl(), backupPersistentId.getCreationType(), nonBackupPersistentId.getCreationType(), strT, str5, str4));
                }
                jVar = (Fyf.j) this.f3365O;
                String str10 = (String) this.f3369t;
                String str11 = (String) this.f3366n;
                ResultKt.throwOnFailure(obj);
                str = str11;
                str3 = str10;
                objO = obj;
                nVar = (x0X.n) objO;
                if (!(nVar instanceof n.C1266n)) {
                    return new n.C1266n(new IllegalStateException("Backup Persistent ID not found: " + ((zD.j) ((n.C1266n) nVar).n()).rl()));
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objN2 = ((n.w6) nVar).n();
                Intrinsics.checkNotNull(objN2, "null cannot be cast to non-null type com.bendingspoons.concierge.domain.entities.Id.Predefined.Internal.BackupPersistentId");
                Id.Predefined.Internal.BackupPersistentId backupPersistentId2 = (Id.Predefined.Internal.BackupPersistentId) objN2;
                InterfaceC1335n interfaceC1335n = Ml.this.f3359t;
                Id.Predefined.Internal.j jVar5 = Id.Predefined.Internal.j.J2;
                this.f3366n = str;
                this.f3369t = str3;
                this.f3365O = jVar;
                this.J2 = backupPersistentId2;
                this.f3368r = 3;
                objO2 = interfaceC1335n.O(jVar5, this);
                if (objO2 != coroutine_suspended) {
                    backupPersistentId = backupPersistentId2;
                    str4 = str3;
                    str5 = str;
                    nVar2 = (x0X.n) objO2;
                    if (!(nVar2 instanceof n.C1266n)) {
                    }
                }
                return coroutine_suspended;
            }
            str2 = (String) this.f3369t;
            String str12 = (String) this.f3366n;
            ResultKt.throwOnFailure(obj);
            str = str12;
            objRl = obj;
            Fyf.j jVar6 = (Fyf.j) objRl;
            if (!Ml.this.f3358O.rl(Ml.mUb)) {
                foC.j jVar7 = Ml.this.f3358O;
                j.C0927j c0927j3 = Ml.mUb;
                Boolean boolBoxBoolean = Boxing.boxBoolean(jVar6.rl());
                synchronized (jVar7) {
                    try {
                        if (jVar7.t()) {
                            jVar7.O().put(c0927j3, boolBoxBoolean);
                        }
                        String strN3 = c0927j3.n();
                        SharedPreferences.Editor editorEdit = jVar7.J2().edit();
                        editorEdit.putBoolean(strN3, boolBoxBoolean.booleanValue());
                        editorEdit.apply();
                        jVar7.n(c0927j3, boolBoxBoolean);
                    } finally {
                    }
                }
            }
            foC.j jVar8 = Ml.this.f3358O;
            j.C0927j c0927j4 = Ml.KN;
            YgZ.w6 w6Var = YgZ.w6.f12217n;
            String strT2 = w6Var.t(Ml.this.rl);
            synchronized (jVar8) {
                try {
                    if (jVar8.t()) {
                        jVar8.O().put(c0927j4, strT2);
                    }
                    String strN4 = c0927j4.n();
                    SharedPreferences.Editor editorEdit2 = jVar8.J2().edit();
                    if (strT2 != null) {
                        editorEdit2.putString(strN4, strT2);
                    } else {
                        String json = jVar8.nr().adapter(String.class).toJson(strT2);
                        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                        editorEdit2.putString(strN4, json);
                    }
                    editorEdit2.apply();
                    jVar8.n(c0927j4, strT2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            foC.j jVar9 = Ml.this.f3358O;
            j.C0927j c0927j5 = Ml.xMQ;
            String strValueOf = String.valueOf(w6Var.rl(Ml.this.rl));
            synchronized (jVar9) {
                try {
                    if (jVar9.t()) {
                        jVar9.O().put(c0927j5, strValueOf);
                    }
                    String strN5 = c0927j5.n();
                    SharedPreferences.Editor editorEdit3 = jVar9.J2().edit();
                    if (strValueOf != null) {
                        editorEdit3.putString(strN5, strValueOf);
                    } else {
                        String json2 = jVar9.nr().adapter(String.class).toJson(strValueOf);
                        Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                        editorEdit3.putString(strN5, json2);
                    }
                    editorEdit3.apply();
                    jVar9.n(c0927j5, strValueOf);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            InterfaceC1335n interfaceC1335n2 = Ml.this.f3359t;
            Id.Predefined.Internal.j jVar10 = Id.Predefined.Internal.j.f51217O;
            this.f3366n = str;
            this.f3369t = str2;
            this.f3365O = jVar6;
            this.f3368r = 2;
            objO = interfaceC1335n2.O(jVar10, this);
            if (objO != coroutine_suspended) {
                str3 = str2;
                jVar = jVar6;
                nVar = (x0X.n) objO;
                if (!(nVar instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new w6(continuation);
        }
    }

    public Ml(Context context, InterfaceC1335n concierge, w6.n config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(config, "config");
        this.rl = context;
        this.f3359t = concierge;
        this.nr = config;
        this.f3358O = new foC.j("INSTALL_MANAGER", context, false, false, et.w6.rl(), null, null, 100, null);
    }

    @Override // Fyf.w6
    public Object rl(Continuation continuation) {
        Fyf.j jVar = this.J2;
        return jVar != null ? jVar : Dsr.Uo(OU.rl(), new n(null), continuation);
    }

    @Override // Fyf.w6
    public Object n(Continuation continuation) {
        return Dsr.Uo(OU.rl(), new w6(null), continuation);
    }
}
