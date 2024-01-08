package com.intellify.taskmanagementapp.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.intellify.taskmanagementapp.data.local.entity.Task;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Task> __insertionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter<Task> __updateAdapterOfTask;

  public TaskDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR IGNORE INTO `task` (`task_id`,`task_name`,`created_date`,`updated_date`,`task_details`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Task entity) {
        statement.bindLong(1, entity.getTaskId());
        if (entity.getTaskName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTaskName());
        }
        if (entity.getCreatedDate() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCreatedDate());
        }
        if (entity.getUpdatedDate() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUpdatedDate());
        }
        if (entity.getTaskDetails() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTaskDetails());
        }
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `task` SET `task_id` = ?,`task_name` = ?,`created_date` = ?,`updated_date` = ?,`task_details` = ? WHERE `task_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Task entity) {
        statement.bindLong(1, entity.getTaskId());
        if (entity.getTaskName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTaskName());
        }
        if (entity.getCreatedDate() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCreatedDate());
        }
        if (entity.getUpdatedDate() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getUpdatedDate());
        }
        if (entity.getTaskDetails() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getTaskDetails());
        }
        statement.bindLong(6, entity.getTaskId());
      }
    };
  }

  @Override
  public Object addTask(final Task task, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTask.insert(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateTask(final Task task, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTask.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAll(final Continuation<? super List<Task>> $completion) {
    final String _sql = "SELECT * FROM task";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Task>>() {
      @Override
      @NonNull
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
          final int _cursorIndexOfTaskName = CursorUtil.getColumnIndexOrThrow(_cursor, "task_name");
          final int _cursorIndexOfCreatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "created_date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_date");
          final int _cursorIndexOfTaskDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "task_details");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Task _item;
            final int _tmpTaskId;
            _tmpTaskId = _cursor.getInt(_cursorIndexOfTaskId);
            final String _tmpTaskName;
            if (_cursor.isNull(_cursorIndexOfTaskName)) {
              _tmpTaskName = null;
            } else {
              _tmpTaskName = _cursor.getString(_cursorIndexOfTaskName);
            }
            final String _tmpCreatedDate;
            if (_cursor.isNull(_cursorIndexOfCreatedDate)) {
              _tmpCreatedDate = null;
            } else {
              _tmpCreatedDate = _cursor.getString(_cursorIndexOfCreatedDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpTaskDetails;
            if (_cursor.isNull(_cursorIndexOfTaskDetails)) {
              _tmpTaskDetails = null;
            } else {
              _tmpTaskDetails = _cursor.getString(_cursorIndexOfTaskDetails);
            }
            _item = new Task(_tmpTaskId,_tmpTaskName,_tmpCreatedDate,_tmpUpdatedDate,_tmpTaskDetails);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
