package com.alightcreative.app.motion.scene.visualeffect;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/PresetInfo;", "", "preset", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "code", "", "words", "", "<init>", "(Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;Ljava/lang/String;Ljava/util/List;)V", "getPreset", "()Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "getCode", "()Ljava/lang/String;", "getWords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PresetInfo {
    private final String code;
    private final EffectPreset preset;
    private final List<String> words;

    public PresetInfo(EffectPreset preset, String code, List<String> words) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(words, "words");
        this.preset = preset;
        this.code = code;
        this.words = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresetInfo copy$default(PresetInfo presetInfo, EffectPreset effectPreset, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectPreset = presetInfo.preset;
        }
        if ((i2 & 2) != 0) {
            str = presetInfo.code;
        }
        if ((i2 & 4) != 0) {
            list = presetInfo.words;
        }
        return presetInfo.copy(effectPreset, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EffectPreset getPreset() {
        return this.preset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<String> component3() {
        return this.words;
    }

    public final PresetInfo copy(EffectPreset preset, String code, List<String> words) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(words, "words");
        return new PresetInfo(preset, code, words);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresetInfo)) {
            return false;
        }
        PresetInfo presetInfo = (PresetInfo) other;
        return Intrinsics.areEqual(this.preset, presetInfo.preset) && Intrinsics.areEqual(this.code, presetInfo.code) && Intrinsics.areEqual(this.words, presetInfo.words);
    }

    public int hashCode() {
        return (((this.preset.hashCode() * 31) + this.code.hashCode()) * 31) + this.words.hashCode();
    }

    public String toString() {
        return "PresetInfo(preset=" + this.preset + ", code=" + this.code + ", words=" + this.words + ")";
    }

    public final String getCode() {
        return this.code;
    }

    public final EffectPreset getPreset() {
        return this.preset;
    }

    public final List<String> getWords() {
        return this.words;
    }

    public /* synthetic */ PresetInfo(EffectPreset effectPreset, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectPreset, (i2 & 2) != 0 ? "" : str, list);
    }
}
