package r53;

import Ko8.l3D;
import QmE.iF;
import android.content.Context;
import android.net.Uri;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneType;
import ga6.j;
import java.io.InputStreamReader;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class C implements aC {
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private final r53.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final l3D f72806O;
    private final iF Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72807n;
    private final r53.Ml nr;
    private final qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Pl f72808t;

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ Ref.IntRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f72809O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Uri f72810S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ C f72811Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72812n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f72813o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f72814r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72815t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Function1 function1, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, C c2, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f72809O = function1;
            this.J2 = intRef;
            this.f72814r = intRef2;
            this.f72813o = intRef3;
            this.f72811Z = c2;
            this.f72810S = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I28 i28 = new I28(this.f72809O, this.J2, this.f72814r, this.f72813o, this.f72811Z, this.f72810S, continuation);
            i28.f72815t = obj;
            return i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72812n;
            if (i2 != 0) {
                if (i2 == 1) {
                    str = (String) this.f72815t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String text = TextStreamsKt.readText(new InputStreamReader((ZipInputStream) this.f72815t, Charsets.UTF_8));
                this.f72809O.invoke(Boxing.boxInt(((((this.J2.element + this.f72814r.element) * 5) + 1) * 100) / (this.f72813o.element * 5)));
                Pl pl = this.f72811Z.f72808t;
                this.f72815t = text;
                this.f72812n = 1;
                Object objN = pl.n(text, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = text;
                obj = objN;
            }
            x0X.n nVar = (x0X.n) obj;
            Function1 function1 = this.f72809O;
            Ref.IntRef intRef = this.J2;
            Ref.IntRef intRef2 = this.f72814r;
            Ref.IntRef intRef3 = this.f72813o;
            C c2 = this.f72811Z;
            Uri uri = this.f72810S;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    boolean zBooleanValue = ((Boolean) ((n.w6) nVar).n()).booleanValue();
                    function1.invoke(Boxing.boxInt(((((intRef.element + intRef2.element) * 5) + 2) * 100) / (intRef3.element * 5)));
                    if (zBooleanValue) {
                        x0X.n nVarN = c2.nr.n(str, uri);
                        if (!(nVarN instanceof n.C1266n)) {
                            if (nVarN instanceof n.w6) {
                                Scene scene = (Scene) ((n.w6) nVarN).n();
                                function1.invoke(Boxing.boxInt(((((intRef.element + intRef2.element) * 5) + 3) * 100) / (intRef3.element * 5)));
                                x0X.n nVarRl = c2.f72806O.rl(scene, uri, Ko8.Xo.f5805t);
                                if (!(nVarRl instanceof n.C1266n)) {
                                    if (nVarRl instanceof n.w6) {
                                        String str2 = (String) ((n.w6) nVarRl).n();
                                        function1.invoke(Boxing.boxInt(((((intRef.element + intRef2.element) * 5) + 4) * 100) / (intRef3.element * 5)));
                                        if (scene.getType() == SceneType.PRESET) {
                                            nVarN = new n.w6(str2);
                                        } else {
                                            nVarN = c2.J2.n(scene, str2);
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    nVarN = nVarRl;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        boolean z3 = nVarN instanceof n.C1266n;
                        if (!z3) {
                            if (nVarN instanceof n.w6) {
                                int i3 = intRef.element + 1;
                                intRef.element = i3;
                                function1.invoke(Boxing.boxInt(((i3 + intRef2.element) * 100) / intRef3.element));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (z3) {
                            int i5 = intRef2.element + 1;
                            intRef2.element = i5;
                            function1.invoke(Boxing.boxInt(((intRef.element + i5) * 100) / intRef3.element));
                        } else if (!(nVarN instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        int i7 = intRef2.element;
                        intRef2.element = i7 + 1;
                        Boxing.boxInt(i7);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Ref.IntRef intRef4 = this.f72814r;
            if (z2) {
                intRef4.element++;
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ZipInputStream zipInputStream, Continuation continuation) {
            return ((I28) create(zipInputStream, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72816n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f72817t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Ref.IntRef intRef, Continuation continuation) {
            super(2, continuation);
            this.f72817t = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f72817t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72816n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f72817t.element++;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ZipInputStream zipInputStream, Continuation continuation) {
            return ((Ml) create(zipInputStream, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72818O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function2 f72819S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Uri f72820Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72821n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72823r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72824t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Uri uri, Function2 function2, Continuation continuation) {
            super(1, continuation);
            this.f72820Z = uri;
            this.f72819S = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C.this.new Wre(this.f72820Z, this.f72819S, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x001c, B:15:0x004f, B:17:0x0055, B:19:0x0068, B:23:0x007b), top: B:31:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x001c, B:15:0x004f, B:17:0x0055, B:19:0x0068, B:23:0x007b), top: B:31:0x001c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:22:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:22:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:22:0x0079). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f72823r
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L2a
                if (r1 != r2) goto L22
                java.lang.Object r1 = r10.J2
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
                java.lang.Object r4 = r10.f72818O
                java.util.zip.ZipInputStream r4 = (java.util.zip.ZipInputStream) r4
                java.lang.Object r5 = r10.f72824t
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                java.lang.Object r6 = r10.f72821n
                java.io.Closeable r6 = (java.io.Closeable) r6
                kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L20
                goto L79
            L20:
                r11 = move-exception
                goto L83
            L22:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2a:
                kotlin.ResultKt.throwOnFailure(r11)
                r53.C r11 = r53.C.this
                android.content.Context r11 = r53.C.t(r11)
                android.content.ContentResolver r11 = r11.getContentResolver()
                android.net.Uri r1 = r10.f72820Z
                java.lang.String r4 = "r"
                android.content.res.AssetFileDescriptor r11 = r11.openAssetFileDescriptor(r1, r4)
                if (r11 == 0) goto L89
                java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
                java.io.FileInputStream r11 = r11.createInputStream()
                r1.<init>(r11)
                kotlin.jvm.functions.Function2 r11 = r10.f72819S
                r5 = r11
                r4 = r1
                r6 = r4
            L4f:
                java.util.zip.ZipEntry r1 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L79
                java.lang.String r11 = r1.getName()     // Catch: java.lang.Throwable -> L20
                java.lang.String r7 = "getName(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r7)     // Catch: java.lang.Throwable -> L20
                java.lang.String r7 = ".xml"
                r8 = 0
                r9 = 2
                boolean r11 = kotlin.text.StringsKt.endsWith$default(r11, r7, r8, r9, r3)     // Catch: java.lang.Throwable -> L20
                if (r11 == 0) goto L79
                r10.f72821n = r6     // Catch: java.lang.Throwable -> L20
                r10.f72824t = r5     // Catch: java.lang.Throwable -> L20
                r10.f72818O = r4     // Catch: java.lang.Throwable -> L20
                r10.J2 = r1     // Catch: java.lang.Throwable -> L20
                r10.f72823r = r2     // Catch: java.lang.Throwable -> L20
                java.lang.Object r11 = r5.invoke(r4, r10)     // Catch: java.lang.Throwable -> L20
                if (r11 != r0) goto L79
                return r0
            L79:
                if (r1 != 0) goto L4f
                kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
                kotlin.io.CloseableKt.closeFinally(r6, r3)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L83:
                throw r11     // Catch: java.lang.Throwable -> L84
            L84:
                r0 = move-exception
                kotlin.io.CloseableKt.closeFinally(r6, r11)
                throw r0
            L89:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: r53.C.Wre.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72825O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f72826Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72827n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f72829r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72830t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72829r = obj;
            this.f72826Z |= Integer.MIN_VALUE;
            return C.this.n(null, null, this);
        }
    }

    static final class w6 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72831O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f72833Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72834g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72835n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f72836o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72837r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72838t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72833Z = obj;
            this.f72834g |= Integer.MIN_VALUE;
            return C.this.rl(null, null, this);
        }
    }

    public C(Context context, qz textFileReader, Pl validateXmlForImportUseCase, r53.Ml getSceneFromXMLUseCase, l3D writeSceneToFileUseCase, r53.j createProjectFromTemplateUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textFileReader, "textFileReader");
        Intrinsics.checkNotNullParameter(validateXmlForImportUseCase, "validateXmlForImportUseCase");
        Intrinsics.checkNotNullParameter(getSceneFromXMLUseCase, "getSceneFromXMLUseCase");
        Intrinsics.checkNotNullParameter(writeSceneToFileUseCase, "writeSceneToFileUseCase");
        Intrinsics.checkNotNullParameter(createProjectFromTemplateUseCase, "createProjectFromTemplateUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f72807n = context;
        this.rl = textFileReader;
        this.f72808t = validateXmlForImportUseCase;
        this.nr = getSceneFromXMLUseCase;
        this.f72806O = writeSceneToFileUseCase;
        this.J2 = createProjectFromTemplateUseCase;
        this.Uo = eventLogger;
    }

    private final Object KN(Uri uri, Function2 function2, Continuation continuation) {
        return x0X.w6.Uo(new Wre(uri, function2, null), continuation);
    }

    private final n.C1266n xMQ(Throwable th) {
        return new n.C1266n(M3.j.n(M3.n.nr(th, j.w6.f67628O, j.EnumC0949j.J2, null, "Failed to unzip file.", 4, null), this.Uo));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r53.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Uri uri, Function1 function1, Continuation continuation) {
        n nVar;
        Uri uri2;
        String str;
        C c2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f72826Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f72826Z = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.f72829r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f72826Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            function1.invoke(Boxing.boxInt(0));
            x0X.n nVarRl = M3.n.rl(this.rl.n(uri), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67621O, null, 8, null);
            if (nVarRl instanceof n.C1266n) {
                return nVarRl;
            }
            if (!(nVarRl instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = (String) ((n.w6) nVarRl).n();
            function1.invoke(Boxing.boxInt(20));
            Pl pl = this.f72808t;
            nVar.f72827n = this;
            nVar.f72830t = uri;
            nVar.f72825O = function1;
            nVar.J2 = str2;
            nVar.f72826Z = 1;
            Object objN = pl.n(str2, nVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            uri2 = uri;
            str = str2;
            obj = objN;
            c2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nVar.J2;
            function1 = (Function1) nVar.f72825O;
            uri2 = (Uri) nVar.f72830t;
            c2 = (C) nVar.f72827n;
            ResultKt.throwOnFailure(obj);
        }
        x0X.n nVar2 = (x0X.n) obj;
        if (nVar2 instanceof n.C1266n) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zBooleanValue = ((Boolean) ((n.w6) nVar2).n()).booleanValue();
        function1.invoke(Boxing.boxInt(40));
        if (!zBooleanValue) {
            return new n.C1266n(M3.j.n(new ga6.j(new MalformedXMLException(null, null, false, 7, null), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67626t, "The xml is invalid."), c2.Uo));
        }
        x0X.n nVarN = c2.nr.n(str, uri2);
        if (nVarN instanceof n.C1266n) {
            return nVarN;
        }
        if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Scene scene = (Scene) ((n.w6) nVarN).n();
        function1.invoke(Boxing.boxInt(60));
        x0X.n nVarRl2 = c2.f72806O.rl(scene, uri2, Ko8.Xo.f5805t);
        if (nVarRl2 instanceof n.C1266n) {
            return nVarRl2;
        }
        if (!(nVarRl2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        String str3 = (String) ((n.w6) nVarRl2).n();
        function1.invoke(Boxing.boxInt(80));
        return scene.getType() == SceneType.PRESET ? new n.w6(str3) : c2.J2.n(scene, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // r53.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Uri uri, Function1 function1, Continuation continuation) {
        w6 w6Var;
        Ref.IntRef intRef;
        C c2;
        Uri uri2;
        Function1 function12;
        Ref.IntRef intRef2;
        Ref.IntRef intRef3;
        C c4;
        Function1 function13;
        Ref.IntRef intRef4;
        Ref.IntRef intRef5;
        x0X.n nVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f72834g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f72834g = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objKN = w6Var.f72833Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f72834g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            function1.invoke(Boxing.boxInt(0));
            intRef = new Ref.IntRef();
            Ref.IntRef intRef6 = new Ref.IntRef();
            Ref.IntRef intRef7 = new Ref.IntRef();
            Ml ml = new Ml(intRef7, null);
            w6Var.f72835n = this;
            w6Var.f72838t = uri;
            w6Var.f72831O = function1;
            w6Var.J2 = intRef;
            w6Var.f72837r = intRef6;
            w6Var.f72836o = intRef7;
            w6Var.f72834g = 1;
            Object objKN2 = KN(uri, ml, w6Var);
            if (objKN2 != coroutine_suspended) {
                c2 = this;
                uri2 = uri;
                function12 = function1;
                intRef2 = intRef6;
                objKN = objKN2;
                intRef3 = intRef7;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef5 = (Ref.IntRef) w6Var.J2;
            intRef4 = (Ref.IntRef) w6Var.f72831O;
            function13 = (Function1) w6Var.f72838t;
            c4 = (C) w6Var.f72835n;
            ResultKt.throwOnFailure(objKN);
            nVar = (x0X.n) objKN;
            if (!(nVar instanceof n.C1266n)) {
                return c4.xMQ((Throwable) ((n.C1266n) nVar).n());
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            function13.invoke(Boxing.boxInt(100));
            if (intRef4.element != 0) {
                return new n.w6(new Pair(Boxing.boxInt(intRef4.element), Boxing.boxInt(intRef5.element)));
            }
            return new n.C1266n(M3.j.n(new ga6.j(new MalformedXMLException(null, null, false, 7, null), j.w6.f67628O, j.EnumC0949j.J2, j.n.f67626t, "Failed to import any XML from the zip file."), c4.Uo));
        }
        Ref.IntRef intRef8 = (Ref.IntRef) w6Var.f72836o;
        Ref.IntRef intRef9 = (Ref.IntRef) w6Var.f72837r;
        intRef = (Ref.IntRef) w6Var.J2;
        Function1 function14 = (Function1) w6Var.f72831O;
        Uri uri3 = (Uri) w6Var.f72838t;
        c2 = (C) w6Var.f72835n;
        ResultKt.throwOnFailure(objKN);
        intRef3 = intRef8;
        intRef2 = intRef9;
        function12 = function14;
        uri2 = uri3;
        Ref.IntRef intRef10 = intRef;
        x0X.n nVar2 = (x0X.n) objKN;
        if (nVar2 instanceof n.C1266n) {
            return c2.xMQ((Throwable) ((n.C1266n) nVar2).n());
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        C c5 = c2;
        I28 i28 = new I28(function12, intRef10, intRef2, intRef3, c5, uri2, null);
        w6Var.f72835n = c5;
        w6Var.f72838t = function12;
        w6Var.f72831O = intRef10;
        w6Var.J2 = intRef2;
        w6Var.f72837r = null;
        w6Var.f72836o = null;
        w6Var.f72834g = 2;
        objKN = c5.KN(uri2, i28, w6Var);
        if (objKN != coroutine_suspended) {
            c4 = c5;
            function13 = function12;
            intRef4 = intRef10;
            intRef5 = intRef2;
            nVar = (x0X.n) objKN;
            if (!(nVar instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }
}
