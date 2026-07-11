package com.alightcreative.app.motion.activities.main.maintabs.templates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.res.StringResources_androidKt;
import com.alightcreative.app.motion.templates.Ml;
import com.alightcreative.app.motion.templates.Template;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem;", "Landroid/os/Parcelable;", "LoadingPlaceholder", "Content", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$LoadingPlaceholder;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TemplateFiltersItem extends Parcelable {

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B(\b\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getText", "", "iconResId", "<init>", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Integer;)V", c.f62177j, "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "t", "Ljava/lang/Integer;", "rl", "()Ljava/lang/Integer;", "Saved", "AllTemplates", "Tag", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$AllTemplates;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$Saved;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$Tag;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content implements TemplateFiltersItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Function2 getText;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Integer iconResId;

        @StabilityInferred
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$AllTemplates;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "<init>", "()V", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AllTemplates extends Content {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final AllTemplates f45446O = new AllTemplates();
            public static final Parcelable.Creator<AllTemplates> CREATOR = new n();

            static final class j implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final j f45447n = new j();

                j() {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return n((Composer) obj, ((Number) obj2).intValue());
                }

                public final String n(Composer composer, int i2) {
                    composer.eF(1711824817);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1711824817, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem.Content.AllTemplates.<init>.<anonymous> (TemplateFiltersItem.kt:26)");
                    }
                    String strT = StringResources_androidKt.t(2132017240, composer, 6);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return strT;
                }
            }

            public static final class n implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final AllTemplates createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllTemplates.f45446O;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public final AllTemplates[] newArray(int i2) {
                    return new AllTemplates[i2];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AllTemplates);
            }

            public int hashCode() {
                return -717508383;
            }

            public String toString() {
                return "AllTemplates";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private AllTemplates() {
                super(j.f45447n, null, 2, 0 == true ? 1 : 0);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$Saved;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "<init>", "()V", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Saved extends Content {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final Saved f45448O = new Saved();
            public static final Parcelable.Creator<Saved> CREATOR = new n();

            static final class j implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final j f45449n = new j();

                j() {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return n((Composer) obj, ((Number) obj2).intValue());
                }

                public final String n(Composer composer, int i2) {
                    composer.eF(-1159361750);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1159361750, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem.Content.Saved.<init>.<anonymous> (TemplateFiltersItem.kt:20)");
                    }
                    String strT = StringResources_androidKt.t(2132020094, composer, 6);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return strT;
                }
            }

            public static final class n implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Saved createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Saved.f45448O;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public final Saved[] newArray(int i2) {
                    return new Saved[i2];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Saved);
            }

            public int hashCode() {
                return 637697118;
            }

            public String toString() {
                return "Saved";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Saved() {
                super(j.f45449n, 2131231553, null);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content$Tag;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$Content;", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tag", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "O", "Ljava/lang/String;", "t", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tag extends Content {
            public static final Parcelable.Creator<Tag> CREATOR = new n();

            /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tag;

            static final class j implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f45451n;

                j(String str) {
                    this.f45451n = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return n((Composer) obj, ((Number) obj2).intValue());
                }

                public final String n(Composer composer, int i2) {
                    composer.eF(1929977725);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1929977725, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.models.TemplateFiltersItem.Content.Tag.<init>.<anonymous> (TemplateFiltersItem.kt:31)");
                    }
                    String strGh = Ml.gh(this.f45451n, composer, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer.Xw();
                    return strGh;
                }
            }

            public static final class n implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Tag createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Tag(Template.Tag.CREATOR.createFromParcel(parcel).getValue(), null);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public final Tag[] newArray(int i2) {
                    return new Tag[i2];
                }
            }

            public /* synthetic */ Tag(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tag) && Template.Tag.J2(this.tag, ((Tag) other).tag);
            }

            public int hashCode() {
                return Template.Tag.Uo(this.tag);
            }

            public String toString() {
                return "Tag(tag=" + Template.Tag.KN(this.tag) + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Template.Tag.mUb(this.tag, dest, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            private Tag(String tag) {
                super(new j(tag), null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.tag = tag;
            }

            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getTag() {
                return this.tag;
            }
        }

        public /* synthetic */ Content(Function2 function2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(function2, num);
        }

        private Content(Function2 function2, Integer num) {
            this.getText = function2;
            this.iconResId = num;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Function2 getGetText() {
            return this.getText;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Integer getIconResId() {
            return this.iconResId;
        }

        public /* synthetic */ Content(Function2 function2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(function2, (i2 & 2) != 0 ? null : num, null);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem$LoadingPlaceholder;", "Lcom/alightcreative/app/motion/activities/main/maintabs/templates/models/TemplateFiltersItem;", "<init>", "()V", "describeContents", "", "equals", "", InneractiveMediationNameConsts.OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadingPlaceholder implements TemplateFiltersItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final LoadingPlaceholder f45452n = new LoadingPlaceholder();
        public static final Parcelable.Creator<LoadingPlaceholder> CREATOR = new j();

        public static final class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final LoadingPlaceholder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoadingPlaceholder.f45452n;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final LoadingPlaceholder[] newArray(int i2) {
                return new LoadingPlaceholder[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadingPlaceholder);
        }

        public int hashCode() {
            return 2013134443;
        }

        public String toString() {
            return "LoadingPlaceholder";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private LoadingPlaceholder() {
        }
    }
}
