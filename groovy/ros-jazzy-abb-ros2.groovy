node {
    git url: "https://github.com/PickNikRobotics/abb_ros2.git", branch: "humble"
    registerROS('ros:jazzy-desktop-full', [
        'ros-jazzy-abb-egm-rws-managers',
        'ros-jazzy-abb-ros2-msgs',
        'ros-jazzy-controller-manager',
        'ros-jazzy-hardware-interface',
        'ros-jazzy-joint-state-broadcaster',
        'ros-jazzy-joint-state-publisher',
        'ros-jazzy-joint-trajectory-controller',
        'ros-jazzy-ros-testing'
    ], [])
}
