package kotlinx.serialization.json;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@XA.Xo(with = Ln.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0001\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/qf;", "Lkotlinx/serialization/json/Dsr;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "t", AppLovinEventTypes.USER_VIEWED_CONTENT, "Companion", "j", "Lkotlinx/serialization/json/r;", "Lkotlinx/serialization/json/afx;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class qf extends Dsr {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.serialization.json.qf$j, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final XA.Ml serializer() {
            return Ln.f70263n;
        }
    }

    public /* synthetic */ qf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String t();

    private qf() {
        super(null);
    }

    public String toString() {
        return t();
    }
}
