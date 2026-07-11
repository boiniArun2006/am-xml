package com.bendingspoons.monopoly.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Wre;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class RecurrenceMode {
    public static final int $stable = 0;
    public static final j Companion = new j(null);

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/monopoly/product/RecurrenceMode$FiniteRecurring;", "Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "billingCycleCount", "", "<init>", "(I)V", "getBillingCycleCount", "()I", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiniteRecurring extends RecurrenceMode {
        public static final int $stable = 0;
        private final int billingCycleCount;

        public FiniteRecurring(int i2) {
            super(null);
            this.billingCycleCount = i2;
        }

        public static /* synthetic */ FiniteRecurring copy$default(FiniteRecurring finiteRecurring, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = finiteRecurring.billingCycleCount;
            }
            return finiteRecurring.copy(i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBillingCycleCount() {
            return this.billingCycleCount;
        }

        public final FiniteRecurring copy(int billingCycleCount) {
            return new FiniteRecurring(billingCycleCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FiniteRecurring) && this.billingCycleCount == ((FiniteRecurring) other).billingCycleCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.billingCycleCount);
        }

        public String toString() {
            return "FiniteRecurring(billingCycleCount=" + this.billingCycleCount + ")";
        }

        public final int getBillingCycleCount() {
            return this.billingCycleCount;
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bendingspoons/monopoly/product/RecurrenceMode$InfiniteRecurring;", "Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "<init>", "()V", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InfiniteRecurring extends RecurrenceMode {
        public static final int $stable = 0;

        public InfiniteRecurring() {
            super(null);
        }

        public boolean equals(Object other) {
            return other instanceof InfiniteRecurring;
        }

        public int hashCode() {
            return InfiniteRecurring.class.hashCode();
        }
    }

    @StabilityInferred
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bendingspoons/monopoly/product/RecurrenceMode$NonRecurring;", "Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "<init>", "()V", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NonRecurring extends RecurrenceMode {
        public static final int $stable = 0;

        public NonRecurring() {
            super(null);
        }

        public boolean equals(Object other) {
            return other instanceof NonRecurring;
        }

        public int hashCode() {
            return NonRecurring.class.hashCode();
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final RecurrenceMode n(Wre.w6 pricingPhase) {
            Intrinsics.checkNotNullParameter(pricingPhase, "pricingPhase");
            int iJ2 = pricingPhase.J2();
            if (iJ2 == 1) {
                return new InfiniteRecurring();
            }
            if (iJ2 == 2) {
                return new FiniteRecurring(pricingPhase.n());
            }
            if (iJ2 == 3) {
                return new NonRecurring();
            }
            throw new IllegalArgumentException("Invalid recurrence mode");
        }
    }

    public /* synthetic */ RecurrenceMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecurrenceMode() {
    }
}
