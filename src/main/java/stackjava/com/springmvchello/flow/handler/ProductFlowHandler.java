package stackjava.com.springmvchello.flow.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.webflow.execution.FlowExecutionOutcome;
import org.springframework.webflow.mvc.servlet.AbstractFlowHandler;

public class ProductFlowHandler extends AbstractFlowHandler
{

	public String handleExecutionOutcome(FlowExecutionOutcome outcome, HttpServletRequest request,
			HttpServletResponse response) {
		if (outcome.getId().equals("productList")) {
			return "/getProducts";
		} else {
			return "/hi";
		}
	}

}
