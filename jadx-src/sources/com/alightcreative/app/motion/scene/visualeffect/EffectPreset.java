package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00060"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "", "id", "", "label", "shortCode", "timescale", "", "timing", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;", "properties", "", "Lcom/alightcreative/app/motion/scene/userparam/KeyableUserParameterValue;", "effectId", "parseErrors", "", "presetSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "getShortCode", "getTimescale", "()I", "getTiming", "()Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;", "getProperties", "()Ljava/util/Map;", "getEffectId", "getParseErrors", "()Ljava/util/List;", "getPresetSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EffectPreset {
    public static final int $stable = 8;
    private final String effectId;
    private final String id;
    private final String label;
    private final List<String> parseErrors;
    private final String presetSource;
    private final Map<String, KeyableUserParameterValue> properties;
    private final String shortCode;
    private final int timescale;
    private final EffectPresetTiming timing;

    public EffectPreset(String id, String label, String shortCode, int i2, EffectPresetTiming timing, Map<String, KeyableUserParameterValue> properties, String effectId, List<String> parseErrors, String presetSource) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(shortCode, "shortCode");
        Intrinsics.checkNotNullParameter(timing, "timing");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        Intrinsics.checkNotNullParameter(parseErrors, "parseErrors");
        Intrinsics.checkNotNullParameter(presetSource, "presetSource");
        this.id = id;
        this.label = label;
        this.shortCode = shortCode;
        this.timescale = i2;
        this.timing = timing;
        this.properties = properties;
        this.effectId = effectId;
        this.parseErrors = parseErrors;
        this.presetSource = presetSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectPreset copy$default(EffectPreset effectPreset, String str, String str2, String str3, int i2, EffectPresetTiming effectPresetTiming, Map map, String str4, List list, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = effectPreset.id;
        }
        if ((i3 & 2) != 0) {
            str2 = effectPreset.label;
        }
        if ((i3 & 4) != 0) {
            str3 = effectPreset.shortCode;
        }
        if ((i3 & 8) != 0) {
            i2 = effectPreset.timescale;
        }
        if ((i3 & 16) != 0) {
            effectPresetTiming = effectPreset.timing;
        }
        if ((i3 & 32) != 0) {
            map = effectPreset.properties;
        }
        if ((i3 & 64) != 0) {
            str4 = effectPreset.effectId;
        }
        if ((i3 & 128) != 0) {
            list = effectPreset.parseErrors;
        }
        if ((i3 & 256) != 0) {
            str5 = effectPreset.presetSource;
        }
        List list2 = list;
        String str6 = str5;
        Map map2 = map;
        String str7 = str4;
        EffectPresetTiming effectPresetTiming2 = effectPresetTiming;
        String str8 = str3;
        return effectPreset.copy(str, str2, str8, i2, effectPresetTiming2, map2, str7, list2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShortCode() {
        return this.shortCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimescale() {
        return this.timescale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EffectPresetTiming getTiming() {
        return this.timing;
    }

    public final Map<String, KeyableUserParameterValue> component6() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEffectId() {
        return this.effectId;
    }

    public final List<String> component8() {
        return this.parseErrors;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPresetSource() {
        return this.presetSource;
    }

    public final EffectPreset copy(String id, String label, String shortCode, int timescale, EffectPresetTiming timing, Map<String, KeyableUserParameterValue> properties, String effectId, List<String> parseErrors, String presetSource) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(shortCode, "shortCode");
        Intrinsics.checkNotNullParameter(timing, "timing");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(effectId, "effectId");
        Intrinsics.checkNotNullParameter(parseErrors, "parseErrors");
        Intrinsics.checkNotNullParameter(presetSource, "presetSource");
        return new EffectPreset(id, label, shortCode, timescale, timing, properties, effectId, parseErrors, presetSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectPreset)) {
            return false;
        }
        EffectPreset effectPreset = (EffectPreset) other;
        return Intrinsics.areEqual(this.id, effectPreset.id) && Intrinsics.areEqual(this.label, effectPreset.label) && Intrinsics.areEqual(this.shortCode, effectPreset.shortCode) && this.timescale == effectPreset.timescale && this.timing == effectPreset.timing && Intrinsics.areEqual(this.properties, effectPreset.properties) && Intrinsics.areEqual(this.effectId, effectPreset.effectId) && Intrinsics.areEqual(this.parseErrors, effectPreset.parseErrors) && Intrinsics.areEqual(this.presetSource, effectPreset.presetSource);
    }

    public int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.shortCode.hashCode()) * 31) + Integer.hashCode(this.timescale)) * 31) + this.timing.hashCode()) * 31) + this.properties.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.parseErrors.hashCode()) * 31) + this.presetSource.hashCode();
    }

    public String toString() {
        return "EffectPreset(id=" + this.id + ", label=" + this.label + ", shortCode=" + this.shortCode + ", timescale=" + this.timescale + ", timing=" + this.timing + ", properties=" + this.properties + ", effectId=" + this.effectId + ", parseErrors=" + this.parseErrors + ", presetSource=" + this.presetSource + ")";
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getParseErrors() {
        return this.parseErrors;
    }

    public final String getPresetSource() {
        return this.presetSource;
    }

    public final Map<String, KeyableUserParameterValue> getProperties() {
        return this.properties;
    }

    public final String getShortCode() {
        return this.shortCode;
    }

    public final int getTimescale() {
        return this.timescale;
    }

    public final EffectPresetTiming getTiming() {
        return this.timing;
    }

    public /* synthetic */ EffectPreset(String str, String str2, String str3, int i2, EffectPresetTiming effectPresetTiming, Map map, String str4, List list, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i2, effectPresetTiming, map, str4, (i3 & 128) != 0 ? CollectionsKt.emptyList() : list, (i3 & 256) != 0 ? "" : str5);
    }
}
