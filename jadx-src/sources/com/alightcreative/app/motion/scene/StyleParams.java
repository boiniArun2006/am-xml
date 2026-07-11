package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/StyleParams;", "", "letterSpacing", "", "lineSpacing", "<init>", "(FF)V", "getLetterSpacing", "()F", "getLineSpacing", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyleParams {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float letterSpacing;
    private final float lineSpacing;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/StyleParams$Companion;", "", "<init>", "()V", "forElement", "Lcom/alightcreative/app/motion/scene/StyleParams;", "el", "Lcom/alightcreative/app/motion/scene/SceneElement;", "t", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextElement.kt\ncom/alightcreative/app/motion/scene/StyleParams$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,787:1\n1#2:788\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StyleParams forElement(SceneElement el, float t3) {
            Object next;
            Map<String, KeyableUserParameterValue> parameters;
            KeyableUserParameterValue keyableUserParameterValue;
            Keyable<Float> floatValue;
            Map<String, KeyableUserParameterValue> parameters2;
            KeyableUserParameterValue keyableUserParameterValue2;
            Keyable<Float> floatValue2;
            Intrinsics.checkNotNullParameter(el, "el");
            Iterator<T> it = el.getVisualEffects().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
                if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.textspacing") && !keyableVisualEffectRef.getHidden()) {
                    break;
                }
            }
            KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
            return new StyleParams((keyableVisualEffectRef2 == null || (parameters2 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue2 = parameters2.get("letterspacing")) == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, t3)).floatValue(), (keyableVisualEffectRef2 == null || (parameters = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue = parameters.get("linespacing")) == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue, t3)).floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StyleParams() {
        float f3 = 0.0f;
        this(f3, f3, 3, null);
    }

    public static /* synthetic */ StyleParams copy$default(StyleParams styleParams, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = styleParams.letterSpacing;
        }
        if ((i2 & 2) != 0) {
            f4 = styleParams.lineSpacing;
        }
        return styleParams.copy(f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLineSpacing() {
        return this.lineSpacing;
    }

    public final StyleParams copy(float letterSpacing, float lineSpacing) {
        return new StyleParams(letterSpacing, lineSpacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleParams)) {
            return false;
        }
        StyleParams styleParams = (StyleParams) other;
        return Float.compare(this.letterSpacing, styleParams.letterSpacing) == 0 && Float.compare(this.lineSpacing, styleParams.lineSpacing) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.letterSpacing) * 31) + Float.hashCode(this.lineSpacing);
    }

    public String toString() {
        return "StyleParams(letterSpacing=" + this.letterSpacing + ", lineSpacing=" + this.lineSpacing + ")";
    }

    public StyleParams(float f3, float f4) {
        this.letterSpacing = f3;
        this.lineSpacing = f4;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public final float getLineSpacing() {
        return this.lineSpacing;
    }

    public /* synthetic */ StyleParams(float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f3, (i2 & 2) != 0 ? 1.0f : f4);
    }
}
