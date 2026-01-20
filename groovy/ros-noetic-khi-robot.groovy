node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:noetic-desktop-full', [
        'libopenblas-dev',
        'ros-noetic-joint-trajectory-controller',
        'ros-noetic-moveit-commander',
        'ros-noetic-moveit-core',
        'ros-noetic-moveit-planners',
        'ros-noetic-moveit-ros-move-group',
        'ros-noetic-moveit-ros-planning-interface',
        'ros-noetic-moveit-simple-controller-manager'
    ], [])
}
