package com.google.firebase.sessions;

import GJW.lej;
import GJW.vd;
import KfI.o;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.n;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LuOq/w6;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", c.f62177j, "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final n Companion = new n(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final g9s appContext;
    private static final g9s backgroundDispatcher;
    private static final g9s blockingDispatcher;
    private static final g9s firebaseApp;
    private static final g9s firebaseInstallationsApi;
    private static final g9s firebaseSessionsComponent;
    private static final g9s transportFactory;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f60795n = new j();

        j() {
            super(4, PreferenceDataStoreDelegateKt.class, "preferencesDataStore", "preferencesDataStore(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", 1);
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ReadOnlyProperty invoke(String p0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 p2, vd p3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            return PreferenceDataStoreDelegateKt.n(p0, replaceFileCorruptionHandler, p2, p3);
        }
    }

    private static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    static {
        g9s g9sVarRl = g9s.rl(Context.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarRl, "unqualified(Context::class.java)");
        appContext = g9sVarRl;
        g9s g9sVarRl2 = g9s.rl(com.google.firebase.Wre.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarRl2, "unqualified(FirebaseApp::class.java)");
        firebaseApp = g9sVarRl2;
        g9s g9sVarRl3 = g9s.rl(s9b.I28.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarRl3, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = g9sVarRl3;
        g9s g9sVarN = g9s.n(F2O.j.class, lej.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarN, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = g9sVarN;
        g9s g9sVarN2 = g9s.n(F2O.n.class, lej.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarN2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = g9sVarN2;
        g9s g9sVarRl4 = g9s.rl(bF.Dsr.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarRl4, "unqualified(TransportFactory::class.java)");
        transportFactory = g9sVarRl4;
        g9s g9sVarRl5 = g9s.rl(com.google.firebase.sessions.n.class);
        Intrinsics.checkNotNullExpressionValue(g9sVarRl5, "unqualified(FirebaseSessionsComponent::class.java)");
        firebaseSessionsComponent = g9sVarRl5;
        try {
            j.f60795n.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o getComponents$lambda$0(uOq.Ml ml) {
        return ((com.google.firebase.sessions.n) ml.KN(firebaseSessionsComponent)).nr();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        return CollectionsKt.listOf((Object[]) new uOq.w6[]{uOq.w6.t(o.class).KN(LIBRARY_NAME).rl(z.gh(firebaseSessionsComponent)).J2(new uOq.CN3() { // from class: KfI.Pl
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(ml);
            }
        }).O().nr(), uOq.w6.t(com.google.firebase.sessions.n.class).KN("fire-sessions-component").rl(z.gh(appContext)).rl(z.gh(backgroundDispatcher)).rl(z.gh(blockingDispatcher)).rl(z.gh(firebaseApp)).rl(z.gh(firebaseInstallationsApi)).rl(z.az(transportFactory)).J2(new uOq.CN3() { // from class: KfI.Xo
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(ml);
            }
        }).nr(), N03.fuX.rl(LIBRARY_NAME, "2.1.2")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.n getComponents$lambda$1(uOq.Ml ml) {
        n.j jVarN = com.google.firebase.sessions.j.n();
        Object objKN = ml.KN(appContext);
        Intrinsics.checkNotNullExpressionValue(objKN, "container[appContext]");
        n.j jVarJ2 = jVarN.J2((Context) objKN);
        Object objKN2 = ml.KN(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(objKN2, "container[backgroundDispatcher]");
        n.j jVarRl = jVarJ2.rl((CoroutineContext) objKN2);
        Object objKN3 = ml.KN(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(objKN3, "container[blockingDispatcher]");
        n.j jVarO = jVarRl.O((CoroutineContext) objKN3);
        Object objKN4 = ml.KN(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(objKN4, "container[firebaseApp]");
        n.j jVarT = jVarO.t((com.google.firebase.Wre) objKN4);
        Object objKN5 = ml.KN(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(objKN5, "container[firebaseInstallationsApi]");
        n.j jVarNr = jVarT.nr((s9b.I28) objKN5);
        oSp.n nVarRl = ml.rl(transportFactory);
        Intrinsics.checkNotNullExpressionValue(nVarRl, "container.getProvider(transportFactory)");
        return jVarNr.n(nVarRl).build();
    }
}
