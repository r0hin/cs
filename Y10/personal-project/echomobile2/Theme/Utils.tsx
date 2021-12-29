import { useEffect, useRef } from "react";

export const useComponentDidMount = (handler : any) => {
  return useEffect(() => {
    return handler();
  }, []);
};

export const useComponentDidUpdate = (handler : any, deps : any) => {
  const isInitialMount = useRef(true);

  useEffect(() => {
    if (isInitialMount.current) {
      isInitialMount.current = false;

      return;
    }

    return handler();
  }, deps);
};