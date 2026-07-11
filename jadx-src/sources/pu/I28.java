package pu;

import GJW.vd;
import android.net.Uri;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 implements pu.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f72068t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KfI.n f72069n;
    private final CoroutineContext rl;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Map f72070O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72071n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f72072r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Map map, Function2 function2, Function2 function22, Continuation continuation) {
            super(2, continuation);
            this.f72070O = map;
            this.J2 = function2;
            this.f72072r = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new n(this.f72070O, this.J2, this.f72072r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72071n;
            try {
            } catch (Exception e2) {
                Function2 function2 = this.f72072r;
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                this.f72071n = 3;
            }
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                URLConnection uRLConnectionOpenConnection = I28.this.t().openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty(com.safedk.android.utils.n.f63222c, "application/json");
                for (Map.Entry entry : this.f72070O.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        objectRef.element = line;
                        if (line == 0) {
                            break;
                        }
                        sb.append((String) line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    Function2 function22 = this.J2;
                    this.f72071n = 1;
                    if (function22.invoke(jSONObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Function2 function23 = this.f72072r;
                    String str = "Bad response code: " + responseCode;
                    this.f72071n = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public I28(KfI.n nVar, CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(nVar, qfEYuUHwj.tfoQiTfLPD);
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f72069n = nVar;
        this.rl = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL t() {
        return new URL(new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(AppLovinBridge.f61290h).appendPath("gmp").appendPath(this.f72069n.rl()).appendPath("settings").appendQueryParameter("build_version", this.f72069n.n().n()).appendQueryParameter("display_version", this.f72069n.n().J2()).build().toString());
    }

    @Override // pu.j
    public Object n(Map map, Function2 function2, Function2 function22, Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(this.rl, new n(map, function2, function22, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }
}
