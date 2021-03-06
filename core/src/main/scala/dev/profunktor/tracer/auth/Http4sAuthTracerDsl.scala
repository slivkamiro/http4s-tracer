/*
 * Copyright 2018-2019 ProfunKtor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.profunktor.tracer.auth

import org.http4s.dsl.Http4sDsl

trait Http4sAuthTracerDsl[F[_]] extends Http4sDsl[F] with AuthTracerDsl

object Http4sAuthTracerDsl {
  def apply[F[_]]: Http4sAuthTracerDsl[F] = new Http4sAuthTracerDsl[F] {}
}
