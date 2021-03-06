/* Copyright (c) 2020 LibJ
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.libj.logging;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

/**
 * A {@link Logger} that proxies its output to {@link System#out} and
 * {@link System#err}.
 */
public class SystemLogger implements Logger {
  private static final String TRACE = "[TRACE] ";
  private static final String DEBUG = "[DEBUG] ";
  private static final String INFO = "[INFO] ";
  private static final String WARN = "[WARN] ";
  private static final String ERROR = "[ERROR] ";

  private final Level level;

  /**
   * Constructs a new {@link SystemLogger} with the specified logging
   * {@link Level} to be used with this logger.
   *
   * @param level The logging {@link Level}.
   * @throws NullPointerException If {@code level} is null.
   */
  public SystemLogger(final Level level) {
    this.level = Objects.requireNonNull(level);
  }

  /**
   * Constructs a new {@link SystemLogger} with the {@link Level#INFO} to be
   * used with this logger.
   */
  public SystemLogger() {
    this.level = Level.INFO;
  }

  @Override
  public String getName() {
    return ROOT_LOGGER_NAME;
  }

  @Override
  public boolean isTraceEnabled() {
    return level.toInt() <= Level.TRACE.toInt();
  }

  @Override
  public void trace(final String msg) {
    if (isTraceEnabled())
      System.out.println(TRACE + msg);
  }

  @Override
  public void trace(final String format, final Object arg) {
    if (isTraceEnabled())
      System.out.println(TRACE + String.format(format, arg));
  }

  @Override
  public void trace(final String format, final Object arg1, final Object arg2) {
    if (isTraceEnabled())
      System.out.println(TRACE + String.format(format, arg1, arg2));
  }

  @Override
  public void trace(final String format, final Object ... arguments) {
    if (isTraceEnabled())
      System.out.println(TRACE + String.format(format, arguments));
  }

  @Override
  public void trace(final String msg, final Throwable t) {
    if (isTraceEnabled()) {
      System.out.println(TRACE + msg);
      t.printStackTrace(System.out);
    }
  }

  @Override
  public boolean isTraceEnabled(final Marker marker) {
    return isTraceEnabled();
  }

  @Override
  public void trace(final Marker marker, final String msg) {
    trace(msg);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg) {
    trace(format, arg);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
    trace(format, arg1, arg2);
  }

  @Override
  public void trace(final Marker marker, final String format, final Object ... argArray) {
    trace(format, argArray);
  }

  @Override
  public void trace(final Marker marker, final String msg, final Throwable t) {
    trace(msg, t);
  }

  @Override
  public boolean isDebugEnabled() {
    return level.toInt() <= Level.DEBUG.toInt();
  }

  @Override
  public void debug(final String msg) {
    if (isDebugEnabled())
      System.out.println(DEBUG + msg);
  }

  @Override
  public void debug(final String format, final Object arg) {
    if (isDebugEnabled())
      System.out.println(DEBUG + String.format(format, arg));
  }

  @Override
  public void debug(final String format, final Object arg1, final Object arg2) {
    if (isDebugEnabled())
      System.out.println(DEBUG + String.format(format, arg1, arg2));
  }

  @Override
  public void debug(final String format, final Object ... arguments) {
    if (isDebugEnabled())
      System.out.println(DEBUG + String.format(format, arguments));
  }

  @Override
  public void debug(final String msg, final Throwable t) {
    if (isDebugEnabled()) {
      System.out.println(DEBUG + msg);
      t.printStackTrace(System.out);
    }
  }

  @Override
  public boolean isDebugEnabled(final Marker marker) {
    return isDebugEnabled();
  }

  @Override
  public void debug(final Marker marker, final String msg) {
    debug(msg);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg) {
    debug(format, arg);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
    debug(format, arg1, arg2);
  }

  @Override
  public void debug(final Marker marker, final String format, final Object ... argArray) {
    debug(format, argArray);
  }

  @Override
  public void debug(final Marker marker, final String msg, final Throwable t) {
    debug(msg, t);
  }

  @Override
  public boolean isInfoEnabled() {
    return level.toInt() <= Level.INFO.toInt();
  }

  @Override
  public void info(final String msg) {
    if (isInfoEnabled())
      System.out.println(INFO + msg);
  }

  @Override
  public void info(final String format, final Object arg) {
    if (isInfoEnabled())
      System.out.println(INFO + String.format(format, arg));
  }

  @Override
  public void info(final String format, final Object arg1, final Object arg2) {
    if (isInfoEnabled())
      System.out.println(INFO + String.format(format, arg1, arg2));
  }

  @Override
  public void info(final String format, final Object ... arguments) {
    if (isInfoEnabled())
      System.out.println(INFO + String.format(format, arguments));
  }

  @Override
  public void info(final String msg, final Throwable t) {
    if (isInfoEnabled()) {
      System.out.println(INFO + msg);
      t.printStackTrace(System.out);
    }
  }

  @Override
  public boolean isInfoEnabled(final Marker marker) {
    return isInfoEnabled();
  }

  @Override
  public void info(final Marker marker, final String msg) {
    info(msg);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg) {
    info(format, arg);
  }

  @Override
  public void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
    info(format, arg1, arg2);
  }

  @Override
  public void info(final Marker marker, final String format, final Object ... argArray) {
    info(format, argArray);
  }

  @Override
  public void info(final Marker marker, final String msg, final Throwable t) {
    info(msg, t);
  }

  @Override
  public boolean isWarnEnabled() {
    return level.toInt() <= Level.WARN.toInt();
  }

  @Override
  public void warn(final String msg) {
    if (isWarnEnabled())
      System.out.println(WARN + msg);
  }

  @Override
  public void warn(final String format, final Object arg) {
    if (isWarnEnabled())
      System.out.println(WARN + String.format(format, arg));
  }

  @Override
  public void warn(final String format, final Object arg1, final Object arg2) {
    if (isWarnEnabled())
      System.out.println(WARN + String.format(format, arg1, arg2));
  }

  @Override
  public void warn(final String format, final Object ... arguments) {
    if (isWarnEnabled())
      System.out.println(WARN + String.format(format, arguments));
  }

  @Override
  public void warn(final String msg, final Throwable t) {
    if (isWarnEnabled()) {
      System.out.println(WARN + msg);
      t.printStackTrace(System.out);
    }
  }

  @Override
  public boolean isWarnEnabled(final Marker marker) {
    return isWarnEnabled();
  }

  @Override
  public void warn(final Marker marker, final String msg) {
    warn(msg);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg) {
    warn(format, arg);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
    warn(format, arg1, arg2);
  }

  @Override
  public void warn(final Marker marker, final String format, final Object ... argArray) {
    warn(format, argArray);
  }

  @Override
  public void warn(final Marker marker, final String msg, final Throwable t) {
    warn(msg, t);
  }

  @Override
  public boolean isErrorEnabled() {
    return level.toInt() <= Level.ERROR.toInt();
  }

  @Override
  public void error(final String msg) {
    if (isErrorEnabled())
      System.err.println(ERROR + msg);
  }

  @Override
  public void error(final String format, final Object arg) {
    if (isErrorEnabled())
      System.err.println(ERROR + String.format(format, arg));
  }

  @Override
  public void error(final String format, final Object arg1, final Object arg2) {
    if (isErrorEnabled())
      System.err.println(ERROR + String.format(format, arg1, arg2));
  }

  @Override
  public void error(final String format, final Object ... arguments) {
    if (isErrorEnabled())
      System.err.println(ERROR + String.format(format, arguments));
  }

  @Override
  public void error(final String msg, final Throwable t) {
    if (isErrorEnabled()) {
      System.err.println(ERROR + msg);
      t.printStackTrace(System.err);
    }
  }

  @Override
  public boolean isErrorEnabled(final Marker marker) {
    return isErrorEnabled();
  }

  @Override
  public void error(final Marker marker, final String msg) {
    error(msg);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg) {
    error(format, arg);
  }

  @Override
  public void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
    error(format, arg1, arg2);
  }

  @Override
  public void error(final Marker marker, final String format, final Object ... argArray) {
    error(format, argArray);
  }

  @Override
  public void error(final Marker marker, final String msg, final Throwable t) {
    error(msg, t);
  }
}