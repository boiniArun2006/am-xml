package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.TransitionParser;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/constraintlayout/compose/Transition;", "Landroidx/constraintlayout/core/parser/CLObject;", "parsedTransition", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "nr", "(Landroidx/constraintlayout/core/state/Transition;)V", "O", "", c.f62177j, "()Ljava/lang/String;", "rl", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/constraintlayout/core/parser/CLObject;", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransitionImpl implements Transition {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final TransitionImpl f34852t = new TransitionImpl(new CLObject(new char[0]));

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CLObject parsedTransition;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/TransitionImpl$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/TransitionImpl;", "EMPTY", "Landroidx/constraintlayout/compose/TransitionImpl;", c.f62177j, "()Landroidx/constraintlayout/compose/TransitionImpl;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransitionImpl n() {
            return TransitionImpl.f34852t;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TransitionImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return Intrinsics.areEqual(this.parsedTransition, ((TransitionImpl) other).parsedTransition);
    }

    public final void O(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.J2(this.parsedTransition, transition);
        } catch (CLParsingException e2) {
            Log.e("CML", "Error parsing JSON " + e2);
        }
    }

    public int hashCode() {
        return this.parsedTransition.hashCode();
    }

    @Override // androidx.constraintlayout.compose.Transition
    public String n() {
        String strN = this.parsedTransition.N("from");
        return strN == null ? TtmlNode.START : strN;
    }

    public final void nr(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.t(this.parsedTransition, transition);
        } catch (CLParsingException e2) {
            Log.e("CML", "Error parsing JSON " + e2);
        }
    }

    @Override // androidx.constraintlayout.compose.Transition
    public String rl() {
        String strN = this.parsedTransition.N("to");
        return strN == null ? TtmlNode.END : strN;
    }

    public TransitionImpl(CLObject cLObject) {
        this.parsedTransition = cLObject;
    }
}
