package com.alightcreative.app.motion.templates;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHB_\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u0018Jh\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0018R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R#\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000b8\u0006¢\u0006\u0012\n\u0004\b5\u00103\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0010R\u001d\u00109\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b9\u0010*\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u001aR\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u001aR\u0013\u0010A\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/alightcreative/app/motion/templates/Template;", "Landroid/os/Parcelable;", "", "firebaseUserId", "templateId", "createdAt", "originalTemplateId", "videoUrl", "thumbnailUrl", "", "downloadsCount", "", "_tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "component8", "()Ljava/util/List;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/alightcreative/app/motion/templates/Template;", "toString", "hashCode", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirebaseUserId", "getTemplateId", "getCreatedAt", "getOriginalTemplateId", "getVideoUrl", "getThumbnailUrl", "I", "getDownloadsCount", "Ljava/util/List;", "Lcom/alightcreative/app/motion/templates/Template$Tag;", "tags", "getTags", "getTags$annotations", "()V", "trackingValue", "getTrackingValue", "getTrackingValue$annotations", "getSmallVideoUrl", "smallVideoUrl", "j$/time/OffsetDateTime", "getCreationDate", "()Lj$/time/OffsetDateTime;", "creationDate", "Landroid/net/Uri;", "getDownloadURI", "()Landroid/net/Uri;", "downloadURI", "Companion", "Tag", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemplate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Template.kt\ncom/alightcreative/app/motion/templates/Template\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,85:1\n1557#2:86\n1628#2,3:87\n1#3:90\n29#4:91\n*S KotlinDebug\n*F\n+ 1 Template.kt\ncom/alightcreative/app/motion/templates/Template\n*L\n43#1:86\n43#1:87,3\n57#1:91\n*E\n"})
public final /* data */ class Template implements Parcelable {
    private final List<String> _tags;
    private final String createdAt;
    private final int downloadsCount;
    private final String firebaseUserId;
    private final String originalTemplateId;
    private final List<Tag> tags;
    private final String templateId;
    private final String thumbnailUrl;
    private final String trackingValue;
    private final String videoUrl;
    public static final int $stable = 8;
    public static final Parcelable.Creator<Template> CREATOR = new n();
    private static final String downloadUrlBase = "https://alightcreative.com";

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/app/motion/templates/Template$Tag;", "Landroid/os/Parcelable;", "", "value", "t", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "mUb", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "nr", "(Ljava/lang/String;)I", "KN", "Uo", "", InneractiveMediationNameConsts.OTHER, "", "O", "(Ljava/lang/String;Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "w6", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    public static final class Tag implements Parcelable {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Tag> CREATOR = new n();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final String f46384O = t("For You");

        /* JADX INFO: renamed from: com.alightcreative.app.motion.templates.Template$Tag$j, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String n() {
                return Tag.f46384O;
            }
        }

        public static final class n implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return Tag.rl(n(parcel));
            }

            public final String n(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Tag.t(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public final Tag[] newArray(int i2) {
                return new Tag[i2];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class w6 {
            private static final /* synthetic */ EnumEntries J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private static final /* synthetic */ w6[] f46387O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final w6 f46388n = new w6("FILTER", 0);

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final w6 f46389t = new w6("STORY_CONTAINER", 1);

            private static final /* synthetic */ w6[] n() {
                return new w6[]{f46388n, f46389t};
            }

            static {
                w6[] w6VarArrN = n();
                f46387O = w6VarArrN;
                J2 = EnumEntriesKt.enumEntries(w6VarArrN);
            }

            public static w6 valueOf(String str) {
                return (w6) Enum.valueOf(w6.class, str);
            }

            public static w6[] values() {
                return (w6[]) f46387O.clone();
            }

            private w6(String str, int i2) {
            }
        }

        public static final boolean J2(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        public static String KN(String str) {
            return "Tag(value=" + str + ")";
        }

        public static boolean O(String str, Object obj) {
            return (obj instanceof Tag) && Intrinsics.areEqual(str, ((Tag) obj).getValue());
        }

        public static int Uo(String str) {
            return str.hashCode();
        }

        public static final void mUb(String str, Parcel dest, int i2) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }

        public static final int nr(String str) {
            return 0;
        }

        public static final /* synthetic */ Tag rl(String str) {
            return new Tag(str);
        }

        public static String t(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        public boolean equals(Object obj) {
            return O(this.value, obj);
        }

        public int hashCode() {
            return Uo(this.value);
        }

        public String toString() {
            return KN(this.value);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return nr(this.value);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i2) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            mUb(this.value, dest, i2);
        }

        private /* synthetic */ Tag(String str) {
            this.value = str;
        }
    }

    public static final class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Template createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Template(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final Template[] newArray(int i2) {
            return new Template[i2];
        }
    }

    public Template(@Json(name = "firebase_user_id") String firebaseUserId, @Json(name = "template_id") String templateId, @Json(name = "created_at") String str, @Json(name = "original_template_id") String originalTemplateId, @Json(name = "video_url") String videoUrl, @Json(name = "thumbnail_url") String thumbnailUrl, @Json(name = "downloads_count") int i2, @Json(name = "tags") List<String> _tags) {
        String string;
        Intrinsics.checkNotNullParameter(firebaseUserId, "firebaseUserId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(originalTemplateId, "originalTemplateId");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(_tags, "_tags");
        this.firebaseUserId = firebaseUserId;
        this.templateId = templateId;
        this.createdAt = str;
        this.originalTemplateId = originalTemplateId;
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.downloadsCount = i2;
        this._tags = _tags;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(_tags, 10));
        Iterator<T> it = _tags.iterator();
        while (it.hasNext()) {
            arrayList.add(Tag.rl(Tag.t((String) it.next())));
        }
        this.tags = arrayList;
        Uri downloadURI = getDownloadURI();
        if (downloadURI == null || (string = downloadURI.toString()) == null) {
            string = this.firebaseUserId + "/" + this.templateId;
        }
        this.trackingValue = string;
    }

    private final List<String> component8() {
        return this._tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Template copy$default(Template template, String str, String str2, String str3, String str4, String str5, String str6, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = template.firebaseUserId;
        }
        if ((i3 & 2) != 0) {
            str2 = template.templateId;
        }
        if ((i3 & 4) != 0) {
            str3 = template.createdAt;
        }
        if ((i3 & 8) != 0) {
            str4 = template.originalTemplateId;
        }
        if ((i3 & 16) != 0) {
            str5 = template.videoUrl;
        }
        if ((i3 & 32) != 0) {
            str6 = template.thumbnailUrl;
        }
        if ((i3 & 64) != 0) {
            i2 = template.downloadsCount;
        }
        if ((i3 & 128) != 0) {
            list = template._tags;
        }
        int i5 = i2;
        List list2 = list;
        String str7 = str5;
        String str8 = str6;
        return template.copy(str, str2, str3, str4, str7, str8, i5, list2);
    }

    public static /* synthetic */ void getTags$annotations() {
    }

    public static /* synthetic */ void getTrackingValue$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirebaseUserId() {
        return this.firebaseUserId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalTemplateId() {
        return this.originalTemplateId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDownloadsCount() {
        return this.downloadsCount;
    }

    public final Template copy(@Json(name = "firebase_user_id") String firebaseUserId, @Json(name = "template_id") String templateId, @Json(name = "created_at") String createdAt, @Json(name = "original_template_id") String originalTemplateId, @Json(name = "video_url") String videoUrl, @Json(name = "thumbnail_url") String thumbnailUrl, @Json(name = "downloads_count") int downloadsCount, @Json(name = "tags") List<String> _tags) {
        Intrinsics.checkNotNullParameter(firebaseUserId, "firebaseUserId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(originalTemplateId, "originalTemplateId");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(_tags, "_tags");
        return new Template(firebaseUserId, templateId, createdAt, originalTemplateId, videoUrl, thumbnailUrl, downloadsCount, _tags);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Template)) {
            return false;
        }
        Template template = (Template) other;
        return Intrinsics.areEqual(this.firebaseUserId, template.firebaseUserId) && Intrinsics.areEqual(this.templateId, template.templateId) && Intrinsics.areEqual(this.createdAt, template.createdAt) && Intrinsics.areEqual(this.originalTemplateId, template.originalTemplateId) && Intrinsics.areEqual(this.videoUrl, template.videoUrl) && Intrinsics.areEqual(this.thumbnailUrl, template.thumbnailUrl) && this.downloadsCount == template.downloadsCount && Intrinsics.areEqual(this._tags, template._tags);
    }

    public int hashCode() {
        int iHashCode = ((this.firebaseUserId.hashCode() * 31) + this.templateId.hashCode()) * 31;
        String str = this.createdAt;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.originalTemplateId.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + Integer.hashCode(this.downloadsCount)) * 31) + this._tags.hashCode();
    }

    public String toString() {
        return "Template(firebaseUserId=" + this.firebaseUserId + ", templateId=" + this.templateId + ", createdAt=" + this.createdAt + ", originalTemplateId=" + this.originalTemplateId + ", videoUrl=" + this.videoUrl + ", thumbnailUrl=" + this.thumbnailUrl + ", downloadsCount=" + this.downloadsCount + ", _tags=" + this._tags + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.firebaseUserId);
        dest.writeString(this.templateId);
        dest.writeString(this.createdAt);
        dest.writeString(this.originalTemplateId);
        dest.writeString(this.videoUrl);
        dest.writeString(this.thumbnailUrl);
        dest.writeInt(this.downloadsCount);
        dest.writeStringList(this._tags);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final OffsetDateTime getCreationDate() {
        String str = this.createdAt;
        if (str != null) {
            return OffsetDateTime.parse(str);
        }
        return null;
    }

    public final Uri getDownloadURI() {
        if (this.firebaseUserId.length() == 0 || this.templateId.length() == 0) {
            return null;
        }
        return Uri.parse(downloadUrlBase + "/am/share/u/" + this.firebaseUserId + "/p/" + this.templateId);
    }

    public final int getDownloadsCount() {
        return this.downloadsCount;
    }

    public final String getFirebaseUserId() {
        return this.firebaseUserId;
    }

    public final String getOriginalTemplateId() {
        return this.originalTemplateId;
    }

    public final String getSmallVideoUrl() {
        return StringsKt.replace$default(this.videoUrl, "video-preview.mp4", "video-preview-small.mp4", false, 4, (Object) null);
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public /* synthetic */ Template(String str, String str2, String str3, String str4, String str5, String str6, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i3 & 64) != 0 ? 0 : i2, list);
    }
}
