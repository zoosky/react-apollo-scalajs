package com.apollographql.scalajs

import me.shadaj.slinky.core.{ExternalComponent, ObjectOrWritten}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

case class ApolloClientOptions(networkInterface: Option[NetworkInterface] = None)
case class NetworkInterfaceOptions(uri: Option[String] = None)

@js.native
trait Query extends js.Object

@js.native
@JSImport("react-apollo", JSImport.Namespace)
object ReactApolloFascade extends js.Object {
  @js.native
  class ApolloClient(options: js.UndefOr[ObjectOrWritten[ApolloClientOptions]] = js.undefined) extends js.Object

  def createNetworkInterface(options: js.UndefOr[ObjectOrWritten[NetworkInterfaceOptions]]): NetworkInterface = js.native

  def gql(query: String): Query = js.native

  def graphql(query: Query): js.Function1[js.Any, js.Object] = js.native
  def graphql(query: Query, options: js.Object): js.Function1[js.Any, js.Object] = js.native
}

@js.native
trait NetworkInterface extends js.Object

object ApolloProvider extends ExternalComponent {
  case class Props(client: ReactApolloFascade.ApolloClient)

  @js.native
  @JSImport("react-apollo", "ApolloProvider")
  private object Comp extends js.Object

  override val component = Comp
}
