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

package dev.profunktor.tracer

import cats.effect._
import cats.syntax.all._
import dev.profunktor.tracer.instances.tracer._
import dev.profunktor.tracer.log4cats._
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger

object Log4CatsServer extends IOApp {

  override def run(args: List[String]): IO[ExitCode] =
    Slf4jLogger.create[IO].flatMap { implicit logger =>
      new Main[IO].server.as(ExitCode.Success)
    }

}
