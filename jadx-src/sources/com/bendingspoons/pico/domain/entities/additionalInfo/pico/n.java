package com.bendingspoons.pico.domain.entities.additionalInfo.pico;

import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements com.bendingspoons.pico.domain.entities.additionalInfo.pico.j {
    private final Function1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f51478O;
    private final Function1 Uo;
    private final Function1 nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f51479t;

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f51480O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f51481S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51483n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f51484o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f51485r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51486t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f51484o = obj;
            this.f51481S |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    public n(Function1 appProvider, Function1 deviceProvider, Function1 installProvider, Function1 monetizationProvider, Function1 experimentProvider, Function1 idsProvider) {
        Intrinsics.checkNotNullParameter(appProvider, "appProvider");
        Intrinsics.checkNotNullParameter(deviceProvider, "deviceProvider");
        Intrinsics.checkNotNullParameter(installProvider, "installProvider");
        Intrinsics.checkNotNullParameter(monetizationProvider, "monetizationProvider");
        Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
        Intrinsics.checkNotNullParameter(idsProvider, "idsProvider");
        this.rl = appProvider;
        this.f51479t = deviceProvider;
        this.nr = installProvider;
        this.f51478O = monetizationProvider;
        this.J2 = experimentProvider;
        this.Uo = idsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.pico.domain.entities.additionalInfo.pico.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        n nVar;
        Object objInvoke;
        n nVar2;
        PicoAdditionalInfo.App app;
        Object objInvoke2;
        PicoAdditionalInfo.Device device;
        PicoAdditionalInfo.App app2;
        n nVar3;
        Object objInvoke3;
        n nVar4;
        PicoAdditionalInfo.Install install;
        Object objInvoke4;
        PicoAdditionalInfo.Monetization monetization;
        PicoAdditionalInfo.Device device2;
        PicoAdditionalInfo.Install install2;
        Object objInvoke5;
        PicoAdditionalInfo.App app3;
        PicoAdditionalInfo.Monetization monetization2;
        PicoAdditionalInfo.Device device3;
        PicoAdditionalInfo.Experiment experiment;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f51481S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f51481S = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objInvoke6 = jVar.f51484o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (jVar.f51481S) {
            case 0:
                ResultKt.throwOnFailure(objInvoke6);
                Function1 function1 = this.rl;
                jVar.f51483n = this;
                jVar.f51481S = 1;
                objInvoke6 = function1.invoke(jVar);
                if (objInvoke6 != coroutine_suspended) {
                    nVar = this;
                    PicoAdditionalInfo.App app4 = (PicoAdditionalInfo.App) objInvoke6;
                    Function1 function12 = nVar.f51479t;
                    jVar.f51483n = nVar;
                    jVar.f51486t = app4;
                    jVar.f51481S = 2;
                    objInvoke = function12.invoke(jVar);
                    if (objInvoke != coroutine_suspended) {
                        nVar2 = nVar;
                        app = app4;
                        objInvoke6 = objInvoke;
                        PicoAdditionalInfo.Device device4 = (PicoAdditionalInfo.Device) objInvoke6;
                        Function1 function13 = nVar2.nr;
                        jVar.f51483n = nVar2;
                        jVar.f51486t = app;
                        jVar.f51480O = device4;
                        jVar.f51481S = 3;
                        objInvoke2 = function13.invoke(jVar);
                        if (objInvoke2 != coroutine_suspended) {
                            device = device4;
                            objInvoke6 = objInvoke2;
                            n nVar5 = nVar2;
                            app2 = app;
                            nVar3 = nVar5;
                            PicoAdditionalInfo.Install install3 = (PicoAdditionalInfo.Install) objInvoke6;
                            Function1 function14 = nVar3.f51478O;
                            jVar.f51483n = nVar3;
                            jVar.f51486t = app2;
                            jVar.f51480O = device;
                            jVar.J2 = install3;
                            jVar.f51481S = 4;
                            objInvoke3 = function14.invoke(jVar);
                            if (objInvoke3 != coroutine_suspended) {
                                nVar4 = nVar3;
                                install = install3;
                                objInvoke6 = objInvoke3;
                                PicoAdditionalInfo.Monetization monetization3 = (PicoAdditionalInfo.Monetization) objInvoke6;
                                Function1 function15 = nVar4.J2;
                                jVar.f51483n = nVar4;
                                jVar.f51486t = app2;
                                jVar.f51480O = device;
                                jVar.J2 = install;
                                jVar.f51485r = monetization3;
                                jVar.f51481S = 5;
                                objInvoke4 = function15.invoke(jVar);
                                if (objInvoke4 != coroutine_suspended) {
                                    PicoAdditionalInfo.Install install4 = install;
                                    monetization = monetization3;
                                    objInvoke6 = objInvoke4;
                                    device2 = device;
                                    install2 = install4;
                                    PicoAdditionalInfo.Experiment experiment2 = (PicoAdditionalInfo.Experiment) objInvoke6;
                                    Function1 function16 = nVar4.Uo;
                                    jVar.f51483n = app2;
                                    jVar.f51486t = device2;
                                    jVar.f51480O = install2;
                                    jVar.J2 = monetization;
                                    jVar.f51485r = experiment2;
                                    jVar.f51481S = 6;
                                    objInvoke5 = function16.invoke(jVar);
                                    if (objInvoke5 != coroutine_suspended) {
                                        app3 = app2;
                                        monetization2 = monetization;
                                        device3 = device2;
                                        experiment = experiment2;
                                        objInvoke6 = objInvoke5;
                                        return new PicoAdditionalInfo(app3, device3, install2, monetization2, experiment, (PicoAdditionalInfo.UserIds) objInvoke6);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                nVar = (n) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                PicoAdditionalInfo.App app42 = (PicoAdditionalInfo.App) objInvoke6;
                Function1 function122 = nVar.f51479t;
                jVar.f51483n = nVar;
                jVar.f51486t = app42;
                jVar.f51481S = 2;
                objInvoke = function122.invoke(jVar);
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                app = (PicoAdditionalInfo.App) jVar.f51486t;
                n nVar6 = (n) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                nVar2 = nVar6;
                PicoAdditionalInfo.Device device42 = (PicoAdditionalInfo.Device) objInvoke6;
                Function1 function132 = nVar2.nr;
                jVar.f51483n = nVar2;
                jVar.f51486t = app;
                jVar.f51480O = device42;
                jVar.f51481S = 3;
                objInvoke2 = function132.invoke(jVar);
                if (objInvoke2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                PicoAdditionalInfo.Device device5 = (PicoAdditionalInfo.Device) jVar.f51480O;
                PicoAdditionalInfo.App app5 = (PicoAdditionalInfo.App) jVar.f51486t;
                n nVar7 = (n) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                device = device5;
                nVar3 = nVar7;
                app2 = app5;
                PicoAdditionalInfo.Install install32 = (PicoAdditionalInfo.Install) objInvoke6;
                Function1 function142 = nVar3.f51478O;
                jVar.f51483n = nVar3;
                jVar.f51486t = app2;
                jVar.f51480O = device;
                jVar.J2 = install32;
                jVar.f51481S = 4;
                objInvoke3 = function142.invoke(jVar);
                if (objInvoke3 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                install = (PicoAdditionalInfo.Install) jVar.J2;
                device = (PicoAdditionalInfo.Device) jVar.f51480O;
                app2 = (PicoAdditionalInfo.App) jVar.f51486t;
                n nVar8 = (n) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                nVar4 = nVar8;
                PicoAdditionalInfo.Monetization monetization32 = (PicoAdditionalInfo.Monetization) objInvoke6;
                Function1 function152 = nVar4.J2;
                jVar.f51483n = nVar4;
                jVar.f51486t = app2;
                jVar.f51480O = device;
                jVar.J2 = install;
                jVar.f51485r = monetization32;
                jVar.f51481S = 5;
                objInvoke4 = function152.invoke(jVar);
                if (objInvoke4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                monetization = (PicoAdditionalInfo.Monetization) jVar.f51485r;
                install2 = (PicoAdditionalInfo.Install) jVar.J2;
                PicoAdditionalInfo.Device device6 = (PicoAdditionalInfo.Device) jVar.f51480O;
                PicoAdditionalInfo.App app6 = (PicoAdditionalInfo.App) jVar.f51486t;
                nVar4 = (n) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                device2 = device6;
                app2 = app6;
                PicoAdditionalInfo.Experiment experiment22 = (PicoAdditionalInfo.Experiment) objInvoke6;
                Function1 function162 = nVar4.Uo;
                jVar.f51483n = app2;
                jVar.f51486t = device2;
                jVar.f51480O = install2;
                jVar.J2 = monetization;
                jVar.f51485r = experiment22;
                jVar.f51481S = 6;
                objInvoke5 = function162.invoke(jVar);
                if (objInvoke5 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                PicoAdditionalInfo.Experiment experiment3 = (PicoAdditionalInfo.Experiment) jVar.f51485r;
                PicoAdditionalInfo.Monetization monetization4 = (PicoAdditionalInfo.Monetization) jVar.J2;
                install2 = (PicoAdditionalInfo.Install) jVar.f51480O;
                PicoAdditionalInfo.Device device7 = (PicoAdditionalInfo.Device) jVar.f51486t;
                PicoAdditionalInfo.App app7 = (PicoAdditionalInfo.App) jVar.f51483n;
                ResultKt.throwOnFailure(objInvoke6);
                monetization2 = monetization4;
                device3 = device7;
                experiment = experiment3;
                app3 = app7;
                return new PicoAdditionalInfo(app3, device3, install2, monetization2, experiment, (PicoAdditionalInfo.UserIds) objInvoke6);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
