package androidx.media3.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;

    @Nullable
    private NotificationCompat.Builder builder;

    @Nullable
    private List<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;

    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;

    @Nullable
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;

    @Nullable
    private MediaSession.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;

    @Nullable
    private final NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;

    @Nullable
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;

    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i2) {
            this.notificationTag = i2;
        }

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;

        @Nullable
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;

        @Nullable
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;

        @Nullable
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i2, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i2, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i2 = this.channelNameResourceId;
            if (i2 != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i2, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i2) {
            this.channelDescriptionResourceId = i2;
            return this;
        }

        public Builder setChannelImportance(int i2) {
            this.channelImportance = i2;
            return this;
        }

        public Builder setChannelNameResourceId(int i2) {
            this.channelNameResourceId = i2;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i2) {
            this.fastForwardActionIconResourceId = i2;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i2) {
            this.nextActionIconResourceId = i2;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i2) {
            this.pauseActionIconResourceId = i2;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i2) {
            this.playActionIconResourceId = i2;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i2) {
            this.previousActionIconResourceId = i2;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i2) {
            this.rewindActionIconResourceId = i2;
            return this;
        }

        public Builder setSmallIconResourceId(int i2) {
            this.smallIconResourceId = i2;
            return this;
        }

        public Builder setStopActionIconResourceId(int i2) {
            this.stopActionIconResourceId = i2;
            return this;
        }

        public Builder(Context context, @IntRange int i2, String str) {
            Assertions.checkArgument(i2 > 0);
            this.context = context;
            this.notificationId = i2;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }
    }

    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int i2);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        @Nullable
        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    private static final class MediaStyle extends NotificationCompat.Style {
        private final int[] actionsToShowInCompact;

        @Nullable
        private final MediaSession.Token token;

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            notificationBuilderWithBuilderAccessor.n().setStyle(mediaStyle);
        }

        public MediaStyle(@Nullable MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }
    }

    private class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i2, boolean z2) {
        }

        default void onNotificationPosted(int i2, Notification notification, boolean z2) {
        }
    }

    private class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    protected List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    protected PlayerNotificationManager(Context context, String str, int i2, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i2;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i3;
        this.groupKey = str2;
        int i13 = instanceIdCounter;
        instanceIdCounter = i13 + 1;
        this.instanceId = i13;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.media3.ui.g9s
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f39953n.handleMessage(message);
            }
        });
        this.notificationManager = NotificationManagerCompat.nr(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i13, i5, i7, i8, i9, i10, i11, i12);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, NotificationCompat.Action> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.EMPTY_MAP;
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i2) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i2);
        return PendingIntent.getBroadcast(context, i2, intent, Util.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new NotificationCompat.Action(i3, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i2)));
        map.put(ACTION_PAUSE, new NotificationCompat.Action(i5, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i2)));
        map.put(ACTION_STOP, new NotificationCompat.Action(i7, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i2)));
        map.put(ACTION_REWIND, new NotificationCompat.Action(i8, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i2)));
        map.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(i9, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i2)));
        map.put(ACTION_PREVIOUS, new NotificationCompat.Action(i10, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i2)));
        map.put(ACTION_NEXT, new NotificationCompat.Action(i11, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i2)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i2 != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i2) {
        this.mainHandler.obtainMessage(2, i2, -1, bitmap).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z2) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            this.notificationManager.rl(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int i2;
        int iIndexOf = list.indexOf(ACTION_PAUSE);
        int iIndexOf2 = list.indexOf(ACTION_PLAY);
        int iIndexOf3 = this.usePreviousActionInCompactView ? list.indexOf(ACTION_PREVIOUS) : this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        int iIndexOf4 = this.useNextActionInCompactView ? list.indexOf(ACTION_NEXT) : this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        int[] iArr = new int[3];
        int i3 = 0;
        if (iIndexOf3 != -1) {
            iArr[0] = iIndexOf3;
            i3 = 1;
        }
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf == -1 || zShouldShowPlayButton) {
            if (iIndexOf2 != -1 && zShouldShowPlayButton) {
                i2 = i3 + 1;
                iArr[i3] = iIndexOf2;
            }
            if (iIndexOf4 != -1) {
                iArr[i3] = iIndexOf4;
                i3++;
            }
            return Arrays.copyOf(iArr, i3);
        }
        i2 = i3 + 1;
        iArr[i3] = iIndexOf;
        i3 = i2;
        if (iIndexOf4 != -1) {
        }
        return Arrays.copyOf(iArr, i3);
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i2) {
        if (this.badgeIconType == i2) {
            return;
        }
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i2;
        invalidate();
    }

    public final void setColor(int i2) {
        if (this.color != i2) {
            this.color = i2;
            invalidate();
        }
    }

    public final void setColorized(boolean z2) {
        if (this.colorized != z2) {
            this.colorized = z2;
            invalidate();
        }
    }

    public final void setDefaults(int i2) {
        if (this.defaults != i2) {
            this.defaults = i2;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Objects.equals(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPriority(int i2) {
        if (this.priority == i2) {
            return;
        }
        if (i2 != -2 && i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i2;
        invalidate();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        if (this.showPlayButtonIfSuppressed != z2) {
            this.showPlayButtonIfSuppressed = z2;
            invalidate();
        }
    }

    public final void setSmallIcon(@DrawableRes int i2) {
        if (this.smallIconResourceId != i2) {
            this.smallIconResourceId = i2;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z2) {
        if (this.useChronometer != z2) {
            this.useChronometer = z2;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z2) {
        if (this.useFastForwardAction != z2) {
            this.useFastForwardAction = z2;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z2) {
        if (this.useFastForwardActionInCompactView != z2) {
            this.useFastForwardActionInCompactView = z2;
            if (z2) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z2) {
        if (this.useNextAction != z2) {
            this.useNextAction = z2;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z2) {
        if (this.useNextActionInCompactView != z2) {
            this.useNextActionInCompactView = z2;
            if (z2) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z2) {
        if (this.usePlayPauseActions != z2) {
            this.usePlayPauseActions = z2;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z2) {
        if (this.usePreviousAction != z2) {
            this.usePreviousAction = z2;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z2) {
        if (this.usePreviousActionInCompactView != z2) {
            this.usePreviousActionInCompactView = z2;
            if (z2) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z2) {
        if (this.useRewindAction != z2) {
            this.useRewindAction = z2;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z2) {
        if (this.useRewindActionInCompactView != z2) {
            this.useRewindActionInCompactView = z2;
            if (z2) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z2) {
        if (this.useStopAction == z2) {
            return;
        }
        this.useStopAction = z2;
        invalidate();
    }

    public final void setVisibility(int i2) {
        if (this.visibility == i2) {
            return;
        }
        if (i2 != -1 && i2 != 0 && i2 != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i2;
        invalidate();
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap bitmap) {
        builder.S(bitmap);
    }

    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        NotificationCompat.Builder builderCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = builderCreateNotification;
        boolean z2 = false;
        if (builderCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationT = builderCreateNotification.t();
        this.notificationManager.J2(this.notificationId, notificationT);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            int i2 = this.notificationId;
            if (ongoing || !this.isNotificationStarted) {
                z2 = true;
            }
            notificationListener.onNotificationPosted(i2, notificationT, z2);
        }
        this.isNotificationStarted = true;
    }

    @Nullable
    protected NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean z2, @Nullable Bitmap bitmap) {
        NotificationCompat.Action action;
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i2 = 0; i2 < actions.size(); i2++) {
            String str = actions.get(i2);
            if (this.playbackActions.containsKey(str)) {
                action = this.playbackActions.get(str);
            } else {
                action = this.customActions.get(str);
            }
            if (action != null) {
                arrayList.add(action);
            }
        }
        if (builder == null || !arrayList.equals(this.builderActions)) {
            builder = new NotificationCompat.Builder(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                builder.rl((NotificationCompat.Action) arrayList.get(i3));
            }
        }
        builder.fD(new MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player)));
        builder.r(this.dismissPendingIntent);
        builder.mUb(this.badgeIconType).aYN(z2).qie(this.color).az(this.colorized).iF(this.smallIconResourceId).T(this.visibility).nY(this.priority).Ik(this.defaults);
        if (this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            builder.N(System.currentTimeMillis() - player.getContentPosition()).te(true).X(true);
        } else {
            builder.te(false).X(false);
        }
        builder.ck(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.HI(this.mediaDescriptionAdapter.getCurrentContentText(player));
        builder.E2(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i5 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i5;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i5));
        }
        setLargeIcon(builder, bitmap);
        builder.ty(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            builder.XQ(str2);
        }
        builder.ViF(true);
        return builder;
    }

    protected boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        if ((playbackState == 2 || playbackState == 3) && player.getPlayWhenReady()) {
            return true;
        }
        return false;
    }

    public final void setPlayer(@Nullable Player player) {
        boolean z2;
        boolean z3 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z3 = false;
        }
        Assertions.checkArgument(z3);
        Player player2 = this.player;
        if (player2 != player) {
            if (player2 != null) {
                player2.removeListener(this.playerListener);
                if (player == null) {
                    stopNotification(false);
                }
            }
            this.player = player;
            if (player != null) {
                player.addListener(this.playerListener);
                postStartOrUpdateNotification();
            }
        }
    }
}
