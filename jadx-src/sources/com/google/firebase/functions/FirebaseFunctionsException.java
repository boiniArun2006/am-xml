package com.google.firebase.functions;

import android.util.SparseArray;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.firebase.FirebaseException;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import mCM.C2292c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\rB#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB-\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/functions/FirebaseFunctionsException;", "Lcom/google/firebase/FirebaseException;", "", "message", "Lcom/google/firebase/functions/FirebaseFunctionsException$j;", "code", "", "details", "<init>", "(Ljava/lang/String;Lcom/google/firebase/functions/FirebaseFunctionsException$j;Ljava/lang/Object;)V", "", "cause", "(Ljava/lang/String;Lcom/google/firebase/functions/FirebaseFunctionsException$j;Ljava/lang/Object;Ljava/lang/Throwable;)V", c.f62177j, "Lcom/google/firebase/functions/FirebaseFunctionsException$j;", "getCode", "()Lcom/google/firebase/functions/FirebaseFunctionsException$j;", "t", "Ljava/lang/Object;", "getDetails", "()Ljava/lang/Object;", "O", "j", "com.google.firebase-firebase-functions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseFunctionsException extends FirebaseException {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j code;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object details;

    public enum j {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final SparseArray f60476O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0805j f60486t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f60488n;

        /* JADX INFO: renamed from: com.google.firebase.functions.FirebaseFunctionsException$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class C0805j {
            public /* synthetic */ C0805j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0805j() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SparseArray rl() {
                SparseArray sparseArray = new SparseArray();
                for (j jVar : j.values()) {
                    j jVar2 = (j) sparseArray.get(jVar.ordinal());
                    if (jVar2 != null) {
                        throw new IllegalStateException((wDgKoYAES.OXhBdKRNfjw + jVar2 + Typography.amp + jVar.name()).toString());
                    }
                    sparseArray.put(jVar.ordinal(), jVar);
                }
                return sparseArray;
            }

            public final j t(int i2) {
                if (i2 == 200) {
                    return j.OK;
                }
                if (i2 == 409) {
                    return j.ABORTED;
                }
                if (i2 == 429) {
                    return j.RESOURCE_EXHAUSTED;
                }
                if (i2 == 400) {
                    return j.INVALID_ARGUMENT;
                }
                if (i2 == 401) {
                    return j.UNAUTHENTICATED;
                }
                if (i2 == 403) {
                    return j.PERMISSION_DENIED;
                }
                if (i2 == 404) {
                    return j.NOT_FOUND;
                }
                if (i2 == 503) {
                    return j.UNAVAILABLE;
                }
                if (i2 == 504) {
                    return j.DEADLINE_EXCEEDED;
                }
                switch (i2) {
                    case 499:
                        return j.CANCELLED;
                    case 500:
                        return j.INTERNAL;
                    case 501:
                        return j.UNIMPLEMENTED;
                    default:
                        return j.UNKNOWN;
                }
            }
        }

        static {
            C0805j c0805j = new C0805j(null);
            f60486t = c0805j;
            f60476O = c0805j.rl();
        }

        j(int i2) {
            this.f60488n = i2;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.functions.FirebaseFunctionsException$n, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FirebaseFunctionsException n(j code, String str, C2292c serializer) {
            Object objOpt;
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            String strName = code.name();
            try {
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject = new JSONObject(str).getJSONObject(MRAIDPresenter.ERROR);
                if (jSONObject.opt("status") instanceof String) {
                    String string = jSONObject.getString("status");
                    Intrinsics.checkNotNullExpressionValue(string, "error.getString(\"status\")");
                    code = j.valueOf(string);
                    strName = code.name();
                }
                if (jSONObject.opt("message") instanceof String) {
                    String string2 = jSONObject.getString("message");
                    Intrinsics.checkNotNullExpressionValue(string2, "error.getString(\"message\")");
                    if (string2.length() > 0) {
                        String string3 = jSONObject.getString("message");
                        Intrinsics.checkNotNullExpressionValue(string3, "error.getString(\"message\")");
                        strName = string3;
                    }
                }
                objOpt = jSONObject.opt("details");
                if (objOpt != null) {
                    try {
                        objOpt = serializer.n(objOpt);
                    } catch (IllegalArgumentException unused) {
                        code = j.INTERNAL;
                        strName = code.name();
                    } catch (JSONException unused2) {
                    }
                }
            } catch (IllegalArgumentException unused3) {
                objOpt = null;
            } catch (JSONException unused4) {
                objOpt = null;
            }
            if (code == j.OK) {
                return null;
            }
            return new FirebaseFunctionsException(strName, code, objOpt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseFunctionsException(String message, j code, Object obj) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.details = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseFunctionsException(String message, j code, Object obj, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNull(th);
        this.code = code;
        this.details = obj;
    }
}
