package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/EditCategory;", "", "<init>", "()V", "Reorder", "ClippingMask", "Lcom/alightcreative/app/motion/scene/EditCategory$ClippingMask;", "Lcom/alightcreative/app/motion/scene/EditCategory$Reorder;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EditCategory {
    public static final int $stable = 0;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/EditCategory$ClippingMask;", "Lcom/alightcreative/app/motion/scene/EditCategory;", "index", "", "<init>", "(I)V", "getIndex", "()I", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClippingMask extends EditCategory {
        public static final int $stable = 0;
        private final int index;

        public ClippingMask(int i2) {
            super(null);
            this.index = i2;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/EditCategory$Reorder;", "Lcom/alightcreative/app/motion/scene/EditCategory;", "from", "", "to", "<init>", "(II)V", "getFrom", "()I", "getTo", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reorder extends EditCategory {
        public static final int $stable = 0;
        private final int from;
        private final int to;

        public Reorder(int i2, int i3) {
            super(null);
            this.from = i2;
            this.to = i3;
        }

        public final int getFrom() {
            return this.from;
        }

        public final int getTo() {
            return this.to;
        }
    }

    public /* synthetic */ EditCategory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditCategory() {
    }
}
