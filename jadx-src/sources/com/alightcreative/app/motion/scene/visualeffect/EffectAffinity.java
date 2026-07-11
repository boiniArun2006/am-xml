package com.alightcreative.app.motion.scene.visualeffect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0003\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity;", "", "type", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;", "strength", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Strength;", "<init>", "(Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Strength;)V", "getType", "()Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;", "getStrength", "()Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Strength;", "component1", "component2", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "Type", "Strength", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EffectAffinity {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Strength strength;
    private final Type type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Companion;", "", "<init>", "()V", "fromString", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity;", CmcdData.STREAMING_FORMAT_SS, "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nVisualEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,777:1\n1310#2,2:778\n*S KotlinDebug\n*F\n+ 1 VisualEffect.kt\ncom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Companion\n*L\n206#1:778,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EffectAffinity fromString(String s2) {
            Type type;
            Intrinsics.checkNotNullParameter(s2, "s");
            int i2 = 0;
            Strength strength = StringsKt.endsWith$default(StringsKt.trim((CharSequence) s2).toString(), "!", false, 2, (Object) null) ? Strength.Required : Strength.Recommended;
            Type[] typeArrValues = Type.values();
            int length = typeArrValues.length;
            while (true) {
                if (i2 >= length) {
                    type = null;
                    break;
                }
                type = typeArrValues[i2];
                if (Intrinsics.areEqual(type.getId(), StringsKt.trim((CharSequence) StringsKt.removeSuffix(StringsKt.trim((CharSequence) s2).toString(), (CharSequence) "!")).toString())) {
                    break;
                }
                i2++;
            }
            if (type == null) {
                return null;
            }
            return new EffectAffinity(type, strength);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Strength;", "", "<init>", "(Ljava/lang/String;I)V", "Required", "Recommended", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Strength {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Strength[] $VALUES;
        public static final Strength Required = new Strength("Required", 0);
        public static final Strength Recommended = new Strength("Recommended", 1);

        private static final /* synthetic */ Strength[] $values() {
            return new Strength[]{Required, Recommended};
        }

        public static EnumEntries<Strength> getEntries() {
            return $ENTRIES;
        }

        static {
            Strength[] strengthArr$values = $values();
            $VALUES = strengthArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(strengthArr$values);
        }

        public static Strength valueOf(String str) {
            return (Strength) Enum.valueOf(Strength.class, str);
        }

        public static Strength[] values() {
            return (Strength[]) $VALUES.clone();
        }

        private Strength(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Text", "Freehand", "Stroke", "TransformAnimation", "Animation", "Media", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private final String id;
        public static final Type Text = new Type("Text", 0, "text");
        public static final Type Freehand = new Type("Freehand", 1, "freehand");
        public static final Type Stroke = new Type("Stroke", 2, "stroke");
        public static final Type TransformAnimation = new Type("TransformAnimation", 3, "transform-animation");
        public static final Type Animation = new Type("Animation", 4, "animation");
        public static final Type Media = new Type("Media", 5, "media");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Text, Freehand, Stroke, TransformAnimation, Animation, Media};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }

        private Type(String str, int i2, String str2) {
            this.id = str2;
        }
    }

    public static /* synthetic */ EffectAffinity copy$default(EffectAffinity effectAffinity, Type type, Strength strength, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            type = effectAffinity.type;
        }
        if ((i2 & 2) != 0) {
            strength = effectAffinity.strength;
        }
        return effectAffinity.copy(type, strength);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Strength getStrength() {
        return this.strength;
    }

    public final EffectAffinity copy(Type type, Strength strength) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(strength, "strength");
        return new EffectAffinity(type, strength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectAffinity)) {
            return false;
        }
        EffectAffinity effectAffinity = (EffectAffinity) other;
        return this.type == effectAffinity.type && this.strength == effectAffinity.strength;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.strength.hashCode();
    }

    public String toString() {
        return "EffectAffinity(type=" + this.type + ", strength=" + this.strength + ")";
    }

    public EffectAffinity(Type type, Strength strength) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(strength, "strength");
        this.type = type;
        this.strength = strength;
    }

    public final Strength getStrength() {
        return this.strength;
    }

    public final Type getType() {
        return this.type;
    }
}
