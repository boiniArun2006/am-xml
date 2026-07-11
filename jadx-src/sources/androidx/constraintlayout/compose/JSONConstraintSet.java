package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0.j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "", AppLovinEventTypes.USER_VIEWED_CONTENT, "overrideVariables", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;", "layoutVariables", "", "aYN", "(Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "rl", "(Ljava/util/List;)Z", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "KN", "(Landroidx/constraintlayout/core/state/Transition;I)V", "Landroidx/constraintlayout/compose/State;", "state", "qie", "(Landroidx/constraintlayout/compose/State;)V", "S", "(Ljava/lang/String;)V", "ty", "()V", "", "O", "()F", "E2", "Landroidx/constraintlayout/compose/ConstraintSet;", "J2", "()Landroidx/constraintlayout/compose/ConstraintSet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "overridedVariables", "X", "Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Z", "_isDirty", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final ConstraintSet extendFrom;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean _isDirty;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final String overrideVariables;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    /* JADX INFO: renamed from: O */
    public float getForcedProgress() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void ty() {
    }

    public JSONConstraintSet(String str, String str2, ConstraintSet constraintSet) {
        super(str);
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap();
        this.overrideVariables = str2;
        this._isDirty = true;
        XQ();
    }

    private final void aYN(ConstraintSetParser.LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject cLObjectNr = CLParser.nr(str);
                int size = cLObjectNr.size();
                for (int i2 = 0; i2 < size; i2++) {
                    CLElement cLElementXQ = cLObjectNr.XQ(i2);
                    Intrinsics.checkNotNull(cLElementXQ, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                    CLKey cLKey = (CLKey) cLElementXQ;
                    layoutVariables.Uo(cLKey.t(), cLKey.M7().J2());
                }
            } catch (CLParsingException e2) {
                System.err.println("exception: " + e2);
            }
        }
        for (String str2 : this.overridedVariables.keySet()) {
            Object obj = this.overridedVariables.get(str2);
            Intrinsics.checkNotNull(obj);
            layoutVariables.Uo(str2, ((Number) obj).floatValue());
        }
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    /* JADX INFO: renamed from: J2, reason: from getter */
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void KN(androidx.constraintlayout.core.state.Transition transition, int type) {
        aYN(new ConstraintSetParser.LayoutVariables());
        ConstraintSetParser.S(getCurrentContent(), transition, type);
    }

    public boolean equals(Object other) {
        if (other instanceof JSONConstraintSet) {
            return Intrinsics.areEqual(getCurrentContent(), ((JSONConstraintSet) other).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void qie(State state) {
        ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();
        aYN(layoutVariables);
        try {
            ConstraintSetParser.XQ(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean rl(List measurables) {
        return this._isDirty;
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    protected void S(String content) {
        super.S(content);
        this._isDirty = true;
    }
}
