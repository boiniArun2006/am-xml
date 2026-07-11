package com.bendingspoons.spidersense.domain.network.entities.sampling;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class SamplingRuleEntity {
    public static final int $stable = 0;
    private final String name;

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$AndRule;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AndRule extends SamplingRuleEntity {
        public static final int $stable = 8;
        private final List<SamplingRuleEntity> value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AndRule copy$default(AndRule andRule, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = andRule.value;
            }
            return andRule.copy(list);
        }

        public final List<SamplingRuleEntity> component1() {
            return this.value;
        }

        public final AndRule copy(List<? extends SamplingRuleEntity> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new AndRule(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AndRule) && Intrinsics.areEqual(this.value, ((AndRule) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "AndRule(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AndRule(List<? extends SamplingRuleEntity> value) {
            super("and", null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final List<SamplingRuleEntity> getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$Categories;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$NamedEntry;", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Categories extends SamplingRuleEntity {
        public static final int $stable = 8;
        private final List<NamedEntry> value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Categories copy$default(Categories categories, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = categories.value;
            }
            return categories.copy(list);
        }

        public final List<NamedEntry> component1() {
            return this.value;
        }

        public final Categories copy(List<NamedEntry> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Categories(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Categories) && Intrinsics.areEqual(this.value, ((Categories) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Categories(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Categories(List<NamedEntry> value) {
            super("categories", null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final List<NamedEntry> getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$Experiments;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$NamedEntry;", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Experiments extends SamplingRuleEntity {
        public static final int $stable = 8;
        private final List<NamedEntry> value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Experiments copy$default(Experiments experiments, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = experiments.value;
            }
            return experiments.copy(list);
        }

        public final List<NamedEntry> component1() {
            return this.value;
        }

        public final Experiments copy(List<NamedEntry> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Experiments(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Experiments) && Intrinsics.areEqual(this.value, ((Experiments) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Experiments(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Experiments(List<NamedEntry> value) {
            super("experiments", null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final List<NamedEntry> getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$NamedEntry;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "value", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NamedEntry {
        public static final int $stable = 0;
        private final String name;
        private final boolean value;

        public static /* synthetic */ NamedEntry copy$default(NamedEntry namedEntry, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = namedEntry.name;
            }
            if ((i2 & 2) != 0) {
                z2 = namedEntry.value;
            }
            return namedEntry.copy(str, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final NamedEntry copy(String name, boolean value) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new NamedEntry(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NamedEntry)) {
                return false;
            }
            NamedEntry namedEntry = (NamedEntry) other;
            return Intrinsics.areEqual(this.name, namedEntry.name) && this.value == namedEntry.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Boolean.hashCode(this.value);
        }

        public String toString() {
            return "NamedEntry(name=" + this.name + ", value=" + this.value + ")";
        }

        public NamedEntry(String name, boolean z2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = z2;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$PremiumUsers;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumUsers extends SamplingRuleEntity {
        public static final int $stable = 0;
        private final boolean value;

        public static /* synthetic */ PremiumUsers copy$default(PremiumUsers premiumUsers, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = premiumUsers.value;
            }
            return premiumUsers.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final PremiumUsers copy(boolean value) {
            return new PremiumUsers(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PremiumUsers) && this.value == ((PremiumUsers) other).value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public String toString() {
            return "PremiumUsers(value=" + this.value + ")";
        }

        public PremiumUsers(boolean z2) {
            super("premium_users", null);
            this.value = z2;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$Severity;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$NamedEntry;", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Severity extends SamplingRuleEntity {
        public static final int $stable = 8;
        private final List<NamedEntry> value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Severity copy$default(Severity severity, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = severity.value;
            }
            return severity.copy(list);
        }

        public final List<NamedEntry> component1() {
            return this.value;
        }

        public final Severity copy(List<NamedEntry> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Severity(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Severity) && Intrinsics.areEqual(this.value, ((Severity) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Severity(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Severity(List<NamedEntry> value) {
            super("severity", null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final List<NamedEntry> getValue() {
            return this.value;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$Spooners;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spooners extends SamplingRuleEntity {
        public static final int $stable = 0;
        private final boolean value;

        public static /* synthetic */ Spooners copy$default(Spooners spooners, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = spooners.value;
            }
            return spooners.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final Spooners copy(boolean value) {
            return new Spooners(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Spooners) && this.value == ((Spooners) other).value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public String toString() {
            return "Spooners(value=" + this.value + ")";
        }

        public Spooners(boolean z2) {
            super("spooners", null);
            this.value = z2;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity$Standard;", "Lcom/bendingspoons/spidersense/domain/network/entities/sampling/SamplingRuleEntity;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "toString", "", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Standard extends SamplingRuleEntity {
        public static final int $stable = 0;
        private final boolean value;

        public static /* synthetic */ Standard copy$default(Standard standard, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = standard.value;
            }
            return standard.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final Standard copy(boolean value) {
            return new Standard(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Standard) && this.value == ((Standard) other).value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public String toString() {
            return "Standard(value=" + this.value + inFlMLxL.WawXUMbBfQV;
        }

        public Standard(boolean z2) {
            super("standard", null);
            this.value = z2;
        }

        public final boolean getValue() {
            return this.value;
        }
    }

    public /* synthetic */ SamplingRuleEntity(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private SamplingRuleEntity(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }
}
